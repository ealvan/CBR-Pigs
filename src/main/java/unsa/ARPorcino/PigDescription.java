package unsa.ARPorcino;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindAndSplitByName;

import es.ucm.fdi.gaia.jcolibri.cbrcore.Attribute;
import es.ucm.fdi.gaia.jcolibri.cbrcore.CaseComponent;

import java.util.LinkedList;
import java.util.List;

public class PigDescription implements CaseComponent {

    @CsvBindByName
    public Integer ID;
    @CsvBindByName
    public Integer F;
    @CsvBindByName
    public Integer D;
    @CsvBindByName
    public Integer A;
    @CsvBindByName
    public Integer E;
    @CsvBindByName
    public Integer VM;
    @CsvBindByName
    public Integer DS;
    @CsvBindByName
    public Integer PR;
    @CsvBindByName
    public Integer C;
    @CsvBindByName
    public Integer PLR;
    @CsvBindByName
    public Integer PS;
    @CsvBindByName
    public Integer HP;
    @CsvBindByName
    public Integer RF;
    @CsvBindByName
    public Integer ETS;
    @CsvBindByName
    public Integer ALP;
    @CsvBindByName
    public Integer LN;
    @CsvBindByName
    public Integer DP;
    @CsvBindByName
    public Integer ESCLF;
    @CsvBindByName
    public Integer CR;
    @CsvBindByName
    public Integer MR;
    @CsvBindByName
    public Integer HMRR;
    @CsvBindByName
    public Integer CJ;
    @CsvBindByName
    public Integer CNV;
    @CsvBindByName
    public Integer ATX;
    @CsvBindByName
    public Integer TS;
    @CsvBindByName
    public String ENFERMEDAD;
    
    /**
     * Constructor with all attributes.
     */
    public PigDescription(Integer ID, Integer F, Integer D, Integer A, Integer E, Integer VM, Integer DS, Integer PR, Integer C, Integer PLR, Integer PS, Integer HP, Integer RF, Integer ETS, Integer ALP, Integer LN, Integer DP, Integer ESCLF, Integer CR, Integer MR, Integer HMRR, Integer CJ, Integer CNV, Integer ATX, Integer TS, String ENFERMEDAD)  
    {
        this.ID = ID;
        this.F = F;
        this.D = D;
        this.A = A;
        this.E = E;
        this.VM = VM;
        this.DS = DS;
        this.PR = PR;
        this.C = C;
        this.PLR = PLR;
        this.PS = PS;
        this.HP = HP;
        this.RF = RF;
        this.ETS = ETS;
        this.ALP = ALP;
        this.LN = LN;
        this.DP = DP;
        this.ESCLF = ESCLF;
        this.CR = CR;
        this.MR = MR;
        this.HMRR = HMRR;
        this.CJ = CJ;
        this.CNV = CNV;
        this.ATX = ATX;
        this.TS = TS;
        this.ENFERMEDAD = ENFERMEDAD;
    }

    public PigDescription() { }
    
    public Attribute getIdAttribute() {
        return new Attribute("id", PigDescription.class);
    }

    /**
     * Returns the value of type Integer for attribute ID.
     * @return value of ID
     */
    public Integer getID()   
    {
        return this.ID;
    }
    
    /**
     * Returns the value of type Integer for attribute F.
     * @return value of F
     */
    public Integer getF()   
    {
        return this.F;
    }
    
    /**
     * Returns the value of type Integer for attribute D.
     * @return value of D
     */
    public Integer getD()   
    {
        return this.D;
    }
    
    /**
     * Returns the value of type Integer for attribute A.
     * @return value of A
     */
    public Integer getA()   
    {
        return this.A;
    }
    
    /**
     * Returns the value of type Integer for attribute E.
     * @return value of E
     */
    public Integer getE()   
    {
        return this.E;
    }
    
    /**
     * Returns the value of type Integer for attribute VM.
     * @return value of VM
     */
    public Integer getVM()   
    {
        return this.VM;
    }
    
    /**
     * Returns the value of type Integer for attribute DS.
     * @return value of DS
     */
    public Integer getDS()   
    {
        return this.DS;
    }
    
    /**
     * Returns the value of type Integer for attribute PR.
     * @return value of PR
     */
    public Integer getPR()   
    {
        return this.PR;
    }
    
    /**
     * Returns the value of type Integer for attribute C.
     * @return value of C
     */
    public Integer getC()   
    {
        return this.C;
    }
    
    /**
     * Returns the value of type Integer for attribute PLR.
     * @return value of PLR
     */
    public Integer getPLR()   
    {
        return this.PLR;
    }
    
    /**
     * Returns the value of type Integer for attribute PS.
     * @return value of PS
     */
    public Integer getPS()   
    {
        return this.PS;
    }
    
    /**
     * Returns the value of type Integer for attribute HP.
     * @return value of HP
     */
    public Integer getHP()   
    {
        return this.HP;
    }
    
    /**
     * Returns the value of type Integer for attribute RF.
     * @return value of RF
     */
    public Integer getRF()   
    {
        return this.RF;
    }
    
    /**
     * Returns the value of type Integer for attribute ETS.
     * @return value of ETS
     */
    public Integer getETS()   
    {
        return this.ETS;
    }
    
    /**
     * Returns the value of type Integer for attribute ALP.
     * @return value of ALP
     */
    public Integer getALP()   
    {
        return this.ALP;
    }
    
    /**
     * Returns the value of type Integer for attribute LN.
     * @return value of LN
     */
    public Integer getLN()   
    {
        return this.LN;
    }
    
    /**
     * Returns the value of type Integer for attribute DP.
     * @return value of DP
     */
    public Integer getDP()   
    {
        return this.DP;
    }
    
    /**
     * Returns the value of type Integer for attribute ESCLF.
     * @return value of ESCLF
     */
    public Integer getESCLF()   
    {
        return this.ESCLF;
    }
    
    /**
     * Returns the value of type Integer for attribute CR.
     * @return value of CR
     */
    public Integer getCR()   
    {
        return this.CR;
    }
    
    /**
     * Returns the value of type Integer for attribute MR.
     * @return value of MR
     */
    public Integer getMR()   
    {
        return this.MR;
    }
    
    /**
     * Returns the value of type Integer for attribute HMRR.
     * @return value of HMRR
     */
    public Integer getHMRR()   
    {
        return this.HMRR;
    }
    
    /**
     * Returns the value of type Integer for attribute CJ.
     * @return value of CJ
     */
    public Integer getCJ()   
    {
        return this.CJ;
    }
    
    /**
     * Returns the value of type Integer for attribute CNV.
     * @return value of CNV
     */
    public Integer getCNV()   
    {
        return this.CNV;
    }
    
    /**
     * Returns the value of type Integer for attribute ATX.
     * @return value of ATX
     */
    public Integer getATX()   
    {
        return this.ATX;
    }
    
    /**
     * Returns the value of type Integer for attribute TS.
     * @return value of TS
     */
    public Integer getTS()   
    {
        return this.TS;
    }
    
    /**
     * Returns the value of type String for attribute ENFERMEDAD.
     * @return value of ENFERMEDAD
     */
    public String getENFERMEDAD()   
    {
        return this.ENFERMEDAD;
    }
    
    // {{ProtectedRegionStart::ManuallyWrittenCode}}    
        // ...
        // insert your customized code here!        
        // ... 
    // {{ProtectedRegionEnd}}
    
}