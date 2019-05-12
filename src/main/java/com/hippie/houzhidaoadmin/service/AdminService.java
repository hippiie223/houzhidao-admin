package com.hippie.houzhidaoadmin.service;

import com.hippie.houzhidaoadmin.domain.Label;
import com.hippie.houzhidaoadmin.domain.LabelDTO;
import com.hippie.houzhidaoadmin.domain.QiNiu;

import java.util.List;

/**
 * @author 39239
 * @Date 2019/5/9 15:46
 * @Package com.hippie.houzhidaoadmin.service
 * @Description:
 */

public interface AdminService {
    boolean insertLabel(Label label);
    boolean deleteLabel(Integer labelId);
    public QiNiu getToken();
    List<LabelDTO> getFirstLabel();
    List<LabelDTO> getSecondLabel(Integer ofLabelId);
}
