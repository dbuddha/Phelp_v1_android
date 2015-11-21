package com.mkbz.phelp.database.table;

import android.provider.BaseColumns;

import com.mkbz.phelp.database.Table;

/**
 * Created by MARCELO on 15-11-2015.
 */
public class CountryTable implements Table {
    private static final String INSERT_TABLE=
            "INSERT INTO country (code,code2,name) VALUES ('AF','AFG','Afghanistan');" +
            "INSERT INTO country ('AL','ALB','Albania');" +
            "INSERT INTO country ('DZ','DZA','Algeria');" +
            "INSERT INTO country ('AS','ASM','American Samoa');" +
            "INSERT INTO country ('AD','AND','Andorra');" +
            "INSERT INTO country ('AO','AGO','Angola');" +
            "INSERT INTO country ('AI','AIA','Anguilla');" +
            "INSERT INTO country ('AQ','ATA','Antarctica');" +
            "INSERT INTO country ('AG','ATG','Antigua and Barbuda');" +
            "INSERT INTO country ('AR','ARG','Argentina');" +
            "INSERT INTO country ('AM','ARM','Armenia');" +
            "INSERT INTO country ('AW','ABW','Aruba');" +
            "INSERT INTO country ('AU','AUS','Australia');" +
            "INSERT INTO country ('AT','AUT','Austria');" +
            "INSERT INTO country ('AZ','AZE','Azerbaijan');" +
            "INSERT INTO country ('BS','BHS','Bahamas');" +
            "INSERT INTO country ('BH','BHR','Bahrain');" +
            "INSERT INTO country ('BD','BGD','Bangladesh');" +
            "INSERT INTO country ('BB','BRB','Barbados');" +
            "INSERT INTO country ('BY','BLR','Belarus');" +
            "INSERT INTO country ('BE','BEL','Belgium');" +
            "INSERT INTO country ('BZ','BLZ','Belize');" +
            "INSERT INTO country ('BJ','BEN','Benin');" +
            "INSERT INTO country ('BM','BMU','Bermuda');" +
            "INSERT INTO country ('BT','BTN','Bhutan');" +
            "INSERT INTO country ('BO','BOL','Bolivia');" +
            "INSERT INTO country ('BA','BIH','Bosnia and Herzegovina');" +
            "INSERT INTO country ('BW','BWA','Botswana');" +
            "INSERT INTO country ('BV','BVT','Bouvet Island');" +
            "INSERT INTO country ('BR','BRA','Brazil');" +
            "INSERT INTO country ('IO','IOT','British Indian Ocean Territory');" +
            "INSERT INTO country ('VG','VGB','British Virgin Islands');" +
            "INSERT INTO country ('BN','BRN','Brunei Darussalam');" +
            "INSERT INTO country ('BG','BGR','Bulgaria');" +
            "INSERT INTO country ('BF','BFA','Burkina Faso');" +
            "INSERT INTO country ('BI','BDI','Burundi');" +
            "INSERT INTO country ('KH','KHM','Cambodia');" +
            "INSERT INTO country ('CM','CMR','Cameroon');" +
            "INSERT INTO country ('CA','CAN','Canada');" +
            "INSERT INTO country ('CV','CPV','Cape Verde');" +
            "INSERT INTO country ('KY','CYM','Cayman Islands');" +
            "INSERT INTO country ('CF','CAF','Central African Republic');" +
            "INSERT INTO country ('TD','TCD','Chad');" +
            "INSERT INTO country ('CL','CHL','Chile');" +
            "INSERT INTO country ('CN','CHN','China');" +
            "INSERT INTO country ('CX','CXR','Christmas Island');" +
            "INSERT INTO country ('CC','CCK','CocosIslands');" +
            "INSERT INTO country ('CO','COL','Colombia');" +
            "INSERT INTO country ('KM','COM','Comoros');" +
            "INSERT INTO country ('CD','COD','Congo');" +
            "INSERT INTO country ('CG','COG','Congo');" +
            "INSERT INTO country ('CK','COK','Cook Islands');" +
            "INSERT INTO country ('CR','CRI','Costa Rica');" +
            "INSERT INTO country ('CI','CIV','Cote DIvoire');" +
            "INSERT INTO country ('CU','CUB','Cuba');" +
            "INSERT INTO country ('CY','CYP','Cyprus');" +
            "INSERT INTO country ('CZ','CZE','Czech Republic');" +
            "INSERT INTO country ('DK','DNK','Denmark');" +
            "INSERT INTO country ('DJ','DJI','Djibouti');" +
            "INSERT INTO country ('DM','DMA','Dominica');" +
            "INSERT INTO country ('DO','DOM','Dominican Republic');" +
            "INSERT INTO country ('EC','ECU','Ecuador');" +
            "INSERT INTO country ('EG','EGY','Egypt');" +
            "INSERT INTO country ('SV','SLV','El Salvador');" +
            "INSERT INTO country ('GQ','GNQ','Equatorial Guinea');" +
            "INSERT INTO country ('ER','ERI','Eritrea');" +
            "INSERT INTO country ('EE','EST','Estonia');" +
            "INSERT INTO country ('ET','ETH','Ethiopia');" +
            "INSERT INTO country ('FO','FRO','Faeroe Islands');" +
            "INSERT INTO country ('FK','FLK','Falkland Islands');" +
            "INSERT INTO country ('FJ','FJI','Fiji');" +
            "INSERT INTO country ('FI','FIN','Finland');" +
            "INSERT INTO country ('FR','FRA','France');" +
            "INSERT INTO country ('GF','GUF','French Guiana');" +
            "INSERT INTO country ('PF','PYF','French Polynesia');" +
            "INSERT INTO country ('TF','ATF','French Southern Territories');" +
            "INSERT INTO country ('GA','GAB','Gabon');" +
            "INSERT INTO country ('GM','GMB','Gambia');" +
            "INSERT INTO country ('GE','GEO','Georgia');" +
            "INSERT INTO country ('DE','DEU','Germany');" +
            "INSERT INTO country ('GH','GHA','Ghana');" +
            "INSERT INTO country ('GI','GIB','Gibraltar');" +
            "INSERT INTO country ('GR','GRC','Greece');" +
            "INSERT INTO country ('GL','GRL','Greenland');" +
            "INSERT INTO country ('GD','GRD','Grenada');" +
            "INSERT INTO country ('GP','GLP','Guadaloupe');" +
            "INSERT INTO country ('GU','GUM','Guam');" +
            "INSERT INTO country ('GT','GTM','Guatemala');" +
            "INSERT INTO country ('GN','GIN','Guinea');" +
            "INSERT INTO country ('GW','GNB','Guinea-Bissau');" +
            "INSERT INTO country ('GY','GUY','Guyana');" +
            "INSERT INTO country ('HT','HTI','Haiti');" +
            "INSERT INTO country ('HM','HMD','Heard and McDonald Islands');" +
            "INSERT INTO country ('VA','VAT','Holy See');" +
            "INSERT INTO country ('HN','HND','Honduras');" +
            "INSERT INTO country ('HK','HKG','Hong Kong');" +
            "INSERT INTO country ('HR','HRV','Hrvatska');" +
            "INSERT INTO country ('HU','HUN','Hungary');" +
            "INSERT INTO country ('IS','ISL','Iceland');" +
            "INSERT INTO country ('IN','IND','India');" +
            "INSERT INTO country ('ID','IDN','Indonesia');" +
            "INSERT INTO country ('IR','IRN','Iran');" +
            "INSERT INTO country ('IQ','IRQ','Iraq');" +
            "INSERT INTO country ('IE','IRL','Ireland');" +
            "INSERT INTO country ('IL','ISR','Israel');" +
            "INSERT INTO country ('IT','ITA','Italy');" +
            "INSERT INTO country ('JM','JAM','Jamaica');" +
            "INSERT INTO country ('JP','JPN','Japan');" +
            "INSERT INTO country ('JO','JOR','Jordan');" +
            "INSERT INTO country ('KZ','KAZ','Kazakhstan');" +
            "INSERT INTO country ('KE','KEN','Kenya');" +
            "INSERT INTO country ('KI','KIR','Kiribati');" +
            "INSERT INTO country ('KP','PRK','Korea');" +
            "INSERT INTO country ('KR','KOR','Korea');" +
            "INSERT INTO country ('KW','KWT','Kuwait');" +
            "INSERT INTO country ('KG','KGZ','Kyrgyz Republic');" +
            "INSERT INTO country ('LA','LAO','Lao Peoples Democratic Republic');" +
            "INSERT INTO country ('LV','LVA','Latvia');" +
            "INSERT INTO country ('LB','LBN','Lebanon');" +
            "INSERT INTO country ('LS','LSO','Lesotho');" +
            "INSERT INTO country ('LR','LBR','Liberia');" +
            "INSERT INTO country ('LY','LBY','Libyan Arab Jamahiriya');" +
            "INSERT INTO country ('LI','LIE','Liechtenstein');" +
            "INSERT INTO country ('LT','LTU','Lithuania');" +
            "INSERT INTO country ('LU','LUX','Luxembourg');" +
            "INSERT INTO country ('MO','MAC','Macao');" +
            "INSERT INTO country ('MK','MKD','Macedonia');" +
            "INSERT INTO country ('MG','MDG','Madagascar');" +
            "INSERT INTO country ('MW','MWI','Malawi');" +
            "INSERT INTO country ('MY','MYS','Malaysia');" +
            "INSERT INTO country ('MV','MDV','Maldives');" +
            "INSERT INTO country ('ML','MLI','Mali');" +
            "INSERT INTO country ('MT','MLT','Malta');" +
            "INSERT INTO country ('MH','MHL','Marshall Islands');" +
            "INSERT INTO country ('MQ','MTQ','Martinique');" +
            "INSERT INTO country ('MR','MRT','Mauritania');" +
            "INSERT INTO country ('MU','MUS','Mauritius');" +
            "INSERT INTO country ('YT','MYT','Mayotte');" +
            "INSERT INTO country ('MX','MEX','Mexico');" +
            "INSERT INTO country ('FM','FSM','Micronesia');" +
            "INSERT INTO country ('MD','MDA','Moldova');" +
            "INSERT INTO country ('MC','MCO','Monaco');" +
            "INSERT INTO country ('MN','MNG','Mongolia');" +
            "INSERT INTO country ('MS','MSR','Montserrat');" +
            "INSERT INTO country ('MA','MAR','Morocco');" +
            "INSERT INTO country ('MZ','MOZ','Mozambique');" +
            "INSERT INTO country ('MM','MMR','Myanmar');" +
            "INSERT INTO country ('NA','NAM','Namibia');" +
            "INSERT INTO country ('NR','NRU','Nauru');" +
            "INSERT INTO country ('NP','NPL','Nepal');" +
            "INSERT INTO country ('AN','ANT','Netherlands Antilles');" +
            "INSERT INTO country ('NL','NLD','Netherlands');" +
            "INSERT INTO country ('NC','NCL','New Caledonia');" +
            "INSERT INTO country ('NZ','NZL','New Zealand');" +
            "INSERT INTO country ('NI','NIC','Nicaragua');" +
            "INSERT INTO country ('NE','NER','Niger');" +
            "INSERT INTO country ('NG','NGA','Nigeria');" +
            "INSERT INTO country ('NU','NIU','Niue');" +
            "INSERT INTO country ('NF','NFK','Norfolk Island');" +
            "INSERT INTO country ('MP','MNP','Northern Mariana Islands');" +
            "INSERT INTO country ('NO','NOR','Norway');" +
            "INSERT INTO country ('OM','OMN','Oman');" +
            "INSERT INTO country ('PK','PAK','Pakistan');" +
            "INSERT INTO country ('PW','PLW','Palau');" +
            "INSERT INTO country ('PS','PSE','Palestinian Territory');" +
            "INSERT INTO country ('PA','PAN','Panama');" +
            "INSERT INTO country ('PG','PNG','Papua New Guinea');" +
            "INSERT INTO country ('PY','PRY','Paraguay');" +
            "INSERT INTO country ('PE','PER','Peru');" +
            "INSERT INTO country ('PH','PHL','Philippines');" +
            "INSERT INTO country ('PN','PCN','Pitcairn Island');" +
            "INSERT INTO country ('PL','POL','Poland');" +
            "INSERT INTO country ('PT','PRT','Portugal');" +
            "INSERT INTO country ('PR','PRI','Puerto Rico');" +
            "INSERT INTO country ('QA','QAT','Qatar');" +
            "INSERT INTO country ('RE','REU','Reunion');" +
            "INSERT INTO country ('RO','ROU','Romania');" +
            "INSERT INTO country ('RU','RUS','Russian Federation');" +
            "INSERT INTO country ('RW','RWA','Rwanda');" +
            "INSERT INTO country ('SH','SHN','St. Helena');" +
            "INSERT INTO country ('KN','KNA','St. Kitts and Nevis');" +
            "INSERT INTO country ('LC','LCA','St. Lucia');" +
            "INSERT INTO country ('PM','SPM','St. Pierre and Miquelon');" +
            "INSERT INTO country ('VC','VCT','St. Vincent and the Grenadines');" +
            "INSERT INTO country ('WS','WSM','Samoa');" +
            "INSERT INTO country ('SM','SMR','San Marino');" +
            "INSERT INTO country ('ST','STP','Sao Tome and Principe');" +
            "INSERT INTO country ('SA','SAU','Saudi Arabia');" +
            "INSERT INTO country ('SN','SEN','Senegal');" +
            "INSERT INTO country ('CS','SCG','Serbia and Montenegro');" +
            "INSERT INTO country ('SC','SYC','Seychelles');" +
            "INSERT INTO country ('SL','SLE','Sierra Leone');" +
            "INSERT INTO country ('SG','SGP','Singapore');" +
            "INSERT INTO country ('SK','SVK','Slovakia');" +
            "INSERT INTO country ('SI','SVN','Slovenia');" +
            "INSERT INTO country ('SB','SLB','Solomon Islands');" +
            "INSERT INTO country ('SO','SOM','Somalia');" +
            "INSERT INTO country ('ZA','ZAF','South Africa');" +
            "INSERT INTO country ('GS','SGS','South Georgia and the South Sandwich Islands');" +
            "INSERT INTO country ('ES','ESP','Spain');" +
            "INSERT INTO country ('LK','LKA','Sri Lanka');" +
            "INSERT INTO country ('SD','SDN','Sudan');" +
            "INSERT INTO country ('SR','SUR','Suriname');" +
            "INSERT INTO country ('SJ','SJM','Svalbard & Jan Mayen Islands');" +
            "INSERT INTO country ('SZ','SWZ','Swaziland');" +
            "INSERT INTO country ('SE','SWE','Sweden');" +
            "INSERT INTO country ('CH','CHE','Switzerland');" +
            "INSERT INTO country ('SY','SYR','Syrian Arab Republic');" +
            "INSERT INTO country ('TW','TWN','Taiwan');" +
            "INSERT INTO country ('TJ','TJK','Tajikistan');" +
            "INSERT INTO country ('TZ','TZA','Tanzania');" +
            "INSERT INTO country ('TH','THA','Thailand');" +
            "INSERT INTO country ('TL','TLS','Timor Leste');" +
            "INSERT INTO country ('TG','TGO','Togo');" +
            "INSERT INTO country ('TK','TKL','Tokelau');" +
            "INSERT INTO country ('TO','TON','Tonga');" +
            "INSERT INTO country ('TT','TTO','Trincodead and Tobago');" +
            "INSERT INTO country ('TN','TUN','Tunisia');" +
            "INSERT INTO country ('TR','TUR','Turkey');" +
            "INSERT INTO country ('TM','TKM','Turkmenistan');" +
            "INSERT INTO country ('TC','TCA','Turks and Caicos Islands');" +
            "INSERT INTO country ('TV','TUV','Tuvalu');" +
            "INSERT INTO country ('VI','VIR','US Virgin Islands');" +
            "INSERT INTO country ('UG','UGA','Uganda');" +
            "INSERT INTO country ('UA','UKR','Ukraine');" +
            "INSERT INTO country ('AE','ARE','United Arab Emirates');" +
            "INSERT INTO country ('GB','GBR','United Kingdom of Great Britain & N. Ireland');" +
            "INSERT INTO country ('UM','UMI','United States Minor Outlying Islands');" +
            "INSERT INTO country ('US','USA','United States of America');" +
            "INSERT INTO country ('UY','URY','Uruguay');" +
            "INSERT INTO country ('UZ','UZB','Uzbekistan');" +
            "INSERT INTO country ('VU','VUT','Vanuatu');" +
            "INSERT INTO country ('VE','VEN','Venezuela');" +
            "INSERT INTO country ('VN','VNM','Viet Nam');" +
            "INSERT INTO country ('WF','WLF','Wallis and Futuna Islands');" +
            "INSERT INTO country ('EH','ESH','Western Sahara');" +
            "INSERT INTO country ('YE','YEM','Yemen');" +
            "INSERT INTO country ('ZM','ZMB','Zambia');" +
            "INSERT INTO country ('ZW','ZWE','Zimbabwe')";


    public static final String SQL_CREATE_TABLE =
            CREATE_TABLE + CountryEntry.TABLE_NAME + " (" +
                    CountryEntry.ID + INTEGER_TYPE + COMMA_SEP +
                    CountryEntry.CODE + TEXT_TYPE + COMMA_SEP +
                    CountryEntry.CODE2 + TEXT_TYPE + COMMA_SEP +
                    CountryEntry.NAME + TEXT_TYPE + COMMA_SEP +
                    PRIMARY_KEY + "(" +
                    CountryEntry.ID  +
                    ") )";
    public static final String SQL_DROP_TABLE =
            "DROP TABLE IF EXISTS " + CountryEntry.TABLE_NAME;

    public static final String[] COLUMNS={CountryEntry.ID,CountryEntry.CODE,CountryEntry.CODE2,CountryEntry.NAME};

    @Override
    public String getCreate() {
        return SQL_CREATE_TABLE;
    }

    @Override
    public String getDelete() {
        return SQL_DROP_TABLE;
    }

    @Override
    public String getPersistentData() {
        return INSERT_TABLE;
    }


    protected static abstract class CountryEntry implements BaseColumns {
        public static final String TABLE_NAME = "country";
        public static final String ID = "id";
        public static final String CODE = "code";
        public static final String CODE2 = "code2";
        public static final String NAME = "name";
    }
}
