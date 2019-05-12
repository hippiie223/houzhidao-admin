package com.hippie.houzhidaoadmin.service.impl;

import com.hippie.houzhidaoadmin.domain.Label;
import com.hippie.houzhidaoadmin.domain.LabelDTO;
import com.hippie.houzhidaoadmin.domain.QiNiu;
import com.hippie.houzhidaoadmin.domain.example.LabelExample;
import com.hippie.houzhidaoadmin.mapper.ExtMapper;
import com.hippie.houzhidaoadmin.mapper.LabelMapper;
import com.hippie.houzhidaoadmin.service.AdminService;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author 39239
 * @Date 2019/5/9 15:46
 * @Package com.hippie.houzhidaoadmin.service.impl
 * @Description:
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private LabelMapper labelMapper;
    @Autowired
    private ExtMapper extMapper;
    @Override
    public boolean insertLabel(Label label) {
        return labelMapper.insertSelective(label) == 1;
    }

    @Override
    public boolean deleteLabel(Integer labelId) {
        LabelExample labelExample = new LabelExample();
        labelExample.createCriteria().andIdEqualTo(labelId);
        return labelMapper.deleteByExample(labelExample) == 1;
    }

    @Override
    public QiNiu getToken() {
        QiNiu qiNiu = new QiNiu();
        String accessKey = "8sZJJeuAxFfbWIEy7C_33ixMc2FC_a5b4mwK4Tzk";
        String secretKey = "Q1yZalN49vBZsa_8l7UDiB0BI8IsrKIImNDWVvTx";
        String bucket = "houzhidao";
        long expireSeconds = 600;   //过期时间
        StringMap putPolicy = new StringMap();
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket,null, expireSeconds,putPolicy);
        qiNiu.setKey(UUID.randomUUID().toString().replaceAll("\\-", ""));
        qiNiu.setToken(upToken);
        return qiNiu;
    }

    @Override
    public List<LabelDTO> getFirstLabel() {
        return extMapper.getFirstLabel();
    }

    @Override
    public List<LabelDTO> getSecondLabel(Integer ofLabelId) {
        return extMapper.getSecondLabel(ofLabelId);
    }
}
