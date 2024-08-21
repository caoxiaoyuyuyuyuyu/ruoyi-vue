package com.ruoyi.schoolInfo;

import com.ruoyi.schoolInfo.mapper.CampusInfoMapper;
import com.ruoyi.schoolInfo.service.ICampusInfoService;
import com.ruoyi.schoolInfo.service.impl.CampusInfoServiceImpl;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

@SpringBootTest
@ActiveProfiles("test")
public class CampusInfoControllerTest {

    @MockBean
    private CampusInfoMapper campusInfoMapper;
    @Test
    public void test() {
        ICampusInfoService campusInfoService = new CampusInfoServiceImpl();
        Long[] campusIds = new Long[]{1L, 2L};
        System.out.println(campusInfoService.deleteCampusInfoByCampusIds(campusIds));
    }

}
