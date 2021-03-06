package com.note.cms.dao;

import com.note.cms.data.model.TbSys;
import com.note.cms.data.model.TbSysExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSysMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_sys
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    long countByExample(TbSysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_sys
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    int deleteByExample(TbSysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_sys
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_sys
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    int insert(TbSys record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_sys
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    int insertSelective(TbSys record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_sys
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    List<TbSys> selectByExample(TbSysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_sys
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    TbSys selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_sys
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    int updateByExampleSelective(@Param("record") TbSys record, @Param("example") TbSysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_sys
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    int updateByExample(@Param("record") TbSys record, @Param("example") TbSysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_sys
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    int updateByPrimaryKeySelective(TbSys record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_sys
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    int updateByPrimaryKey(TbSys record);
}