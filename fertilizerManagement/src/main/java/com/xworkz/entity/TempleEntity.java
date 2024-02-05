package com.xworkz.entity;

import javafx.scene.chart.PieChart;
import lombok.*;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
@Entity
@Table(name = "Temple")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@NamedQuery(name = "findAllByLocation",query = "select fabl from TempleEntity fabl where fabl.location=:lo ")
@NamedQuery(name = "graterthen",query = "select great from TempleEntity great where great.enterFee>:value ")
@NamedQuery(name = "between",query = "SELECT t FROM TempleEntity t WHERE t.enterFee BETWEEN :startFee AND :endFee")
@NamedQuery(name = "date",query = "select t from TempleEntity t where t.inaguratedDate>:current")
@NamedQuery(name = "bygodandlocation",query = "select t from TempleEntity t where t.mainGod=:find and t.location=:findlocarion ")
@NamedQuery(name = "findbyid",query = "select t from TempleEntity t where id=:id")
@NamedQuery(name = "findByIdandMainGod",query = "select e from TempleEntity e where id=:findid and e.mainGod=:findGod")
@NamedQuery(name = "updateLocation",query = "update TempleEntity te set te.location=:newValue where te.name=maramma")
public class TempleEntity {
    //Id, name, location, enterFee, vipEntry, inaguratedDate, mainGod
    @Id
    @Column
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private  int id;
    @NonNull
    private String name;
    @NonNull
    private String location;
    @NonNull
    private int enterFee ;
    @NonNull
    private int vipEntry;
    @NonNull
    private LocalDate inaguratedDate ;
    @NonNull
    private String mainGod;




}
