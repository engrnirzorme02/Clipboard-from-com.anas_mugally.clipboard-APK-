package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.C3377o2;
import com.google.android.gms.ads.internal.util.AbstractC3453S;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p404z2.AbstractC7607x;
import p404z2.C7606w;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfcj {
    public final zzbxc zzA;
    public final String zzB;
    public final JSONObject zzC;
    public final JSONObject zzD;
    public final String zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final int zzQ;
    public final int zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final String zzU;
    public final zzfdf zzV;
    public final boolean zzW;
    public final boolean zzX;
    public final int zzY;
    public final String zzZ;
    public final List zza;
    public final List zzaA;
    public final boolean zzaB;
    public final List zzaC;
    public final boolean zzaD;
    public final int zzaE;
    public final int zzaa;
    public final String zzab;
    public final boolean zzac;
    public final zzbtc zzad;
    public final C3377o2 zzae;
    public final String zzaf;
    public final boolean zzag;
    public final JSONObject zzah;
    public final boolean zzai;
    public final JSONObject zzaj;
    public final boolean zzak;
    public final String zzal;
    public final boolean zzam;
    public final String zzan;
    public final String zzao;
    public final String zzap;
    public final boolean zzaq;
    public final boolean zzar;
    public final int zzas;
    public final String zzat;
    public final List zzau;
    public final boolean zzav;
    public final Map zzaw;
    public final C7606w zzax;
    public final AbstractC7607x zzay;
    public final double zzaz;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final int zze;
    public final List zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final String zzj;
    public final String zzk;
    public final zzbvt zzl;
    public final List zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final int zzq;
    public final List zzr;
    public final zzfco zzs;
    public final List zzt;
    public final List zzu;
    public final JSONObject zzv;
    public final String zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARN: Code duplicated, block: B:267:0x06e5 A[PHI: r87 r89
      0x06e5: PHI (r87v93 java.util.List) = 
      (r87v4 java.util.List)
      (r87v5 java.util.List)
      (r87v6 java.util.List)
      (r87v7 java.util.List)
      (r87v8 java.util.List)
      (r87v9 java.util.List)
      (r87v10 java.util.List)
      (r87v11 java.util.List)
      (r87v12 java.util.List)
      (r87v13 java.util.List)
      (r87v14 java.util.List)
      (r87v15 java.util.List)
      (r87v16 java.util.List)
      (r87v17 java.util.List)
      (r87v18 java.util.List)
      (r87v19 java.util.List)
      (r87v20 java.util.List)
      (r87v21 java.util.List)
      (r87v22 java.util.List)
      (r87v23 java.util.List)
      (r87v24 java.util.List)
      (r87v25 java.util.List)
      (r87v26 java.util.List)
      (r87v27 java.util.List)
      (r87v28 java.util.List)
      (r87v29 java.util.List)
      (r87v30 java.util.List)
      (r87v31 java.util.List)
      (r87v32 java.util.List)
      (r87v33 java.util.List)
      (r87v34 java.util.List)
      (r87v35 java.util.List)
      (r87v36 java.util.List)
      (r87v37 java.util.List)
      (r87v38 java.util.List)
      (r87v39 java.util.List)
      (r87v40 java.util.List)
      (r87v41 java.util.List)
      (r87v42 java.util.List)
      (r87v43 java.util.List)
      (r87v44 java.util.List)
      (r87v45 java.util.List)
      (r87v46 java.util.List)
      (r87v47 java.util.List)
      (r87v48 java.util.List)
      (r87v49 java.util.List)
      (r87v50 java.util.List)
      (r87v51 java.util.List)
      (r87v52 java.util.List)
      (r87v53 java.util.List)
      (r87v54 java.util.List)
      (r87v55 java.util.List)
      (r87v56 java.util.List)
      (r87v57 java.util.List)
      (r87v58 java.util.List)
      (r87v59 java.util.List)
      (r87v60 java.util.List)
      (r87v61 java.util.List)
      (r87v62 java.util.List)
      (r87v63 java.util.List)
      (r87v64 java.util.List)
      (r87v65 java.util.List)
      (r87v66 java.util.List)
      (r87v67 java.util.List)
      (r87v68 java.util.List)
      (r87v69 java.util.List)
      (r87v70 java.util.List)
      (r87v71 java.util.List)
      (r87v72 java.util.List)
      (r87v73 java.util.List)
      (r87v74 java.util.List)
      (r87v75 java.util.List)
      (r87v76 java.util.List)
      (r87v77 java.util.List)
      (r87v78 java.util.List)
      (r87v79 java.util.List)
      (r87v80 java.util.List)
      (r87v81 java.util.List)
      (r87v82 java.util.List)
      (r87v83 java.util.List)
      (r87v84 java.util.List)
      (r87v85 java.util.List)
      (r87v86 java.util.List)
      (r87v87 java.util.List)
      (r87v88 java.util.List)
      (r87v94 java.util.List)
     binds: [B:265:0x06e0, B:262:0x06cf, B:259:0x06be, B:256:0x06ad, B:253:0x069c, B:250:0x068b, B:247:0x0679, B:244:0x0667, B:241:0x0655, B:238:0x0643, B:235:0x0631, B:232:0x061f, B:229:0x060d, B:226:0x05fb, B:223:0x05e9, B:220:0x05d7, B:217:0x05c5, B:214:0x05b3, B:211:0x05a1, B:208:0x058f, B:205:0x057d, B:202:0x056b, B:199:0x0559, B:196:0x0547, B:193:0x0535, B:190:0x0523, B:187:0x0511, B:184:0x0500, B:181:0x04ee, B:178:0x04dc, B:175:0x04ca, B:172:0x04b8, B:169:0x04a6, B:166:0x0494, B:163:0x0482, B:160:0x0471, B:157:0x045f, B:154:0x044d, B:151:0x043b, B:148:0x042a, B:145:0x0418, B:142:0x0406, B:139:0x03f4, B:136:0x03e2, B:133:0x03d0, B:130:0x03be, B:127:0x03ac, B:124:0x039a, B:121:0x0388, B:118:0x0376, B:115:0x0364, B:112:0x0352, B:109:0x0340, B:106:0x032e, B:103:0x031c, B:100:0x030a, B:97:0x02f9, B:94:0x02e7, B:91:0x02d5, B:88:0x02c3, B:85:0x02b1, B:82:0x029f, B:79:0x028e, B:76:0x027c, B:73:0x026a, B:70:0x0258, B:67:0x0246, B:64:0x0234, B:61:0x0222, B:58:0x0210, B:55:0x01fe, B:52:0x01ec, B:49:0x01da, B:46:0x01c8, B:43:0x01b6, B:40:0x01a5, B:37:0x0193, B:34:0x0182, B:31:0x0170, B:28:0x015f, B:25:0x014d, B:22:0x013b, B:19:0x0129, B:16:0x0117, B:13:0x0105, B:11:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x06e5: PHI (r89v87 java.util.List) = 
      (r89v1 java.util.List)
      (r89v2 java.util.List)
      (r89v3 java.util.List)
      (r89v4 java.util.List)
      (r89v5 java.util.List)
      (r89v6 java.util.List)
      (r89v7 java.util.List)
      (r89v8 java.util.List)
      (r89v9 java.util.List)
      (r89v10 java.util.List)
      (r89v11 java.util.List)
      (r89v12 java.util.List)
      (r89v13 java.util.List)
      (r89v14 java.util.List)
      (r89v15 java.util.List)
      (r89v16 java.util.List)
      (r89v17 java.util.List)
      (r89v18 java.util.List)
      (r89v19 java.util.List)
      (r89v20 java.util.List)
      (r89v21 java.util.List)
      (r89v22 java.util.List)
      (r89v23 java.util.List)
      (r89v24 java.util.List)
      (r89v25 java.util.List)
      (r89v26 java.util.List)
      (r89v27 java.util.List)
      (r89v28 java.util.List)
      (r89v29 java.util.List)
      (r89v30 java.util.List)
      (r89v31 java.util.List)
      (r89v32 java.util.List)
      (r89v33 java.util.List)
      (r89v34 java.util.List)
      (r89v35 java.util.List)
      (r89v36 java.util.List)
      (r89v37 java.util.List)
      (r89v38 java.util.List)
      (r89v39 java.util.List)
      (r89v40 java.util.List)
      (r89v41 java.util.List)
      (r89v42 java.util.List)
      (r89v43 java.util.List)
      (r89v44 java.util.List)
      (r89v45 java.util.List)
      (r89v46 java.util.List)
      (r89v47 java.util.List)
      (r89v48 java.util.List)
      (r89v49 java.util.List)
      (r89v50 java.util.List)
      (r89v51 java.util.List)
      (r89v52 java.util.List)
      (r89v53 java.util.List)
      (r89v54 java.util.List)
      (r89v55 java.util.List)
      (r89v56 java.util.List)
      (r89v57 java.util.List)
      (r89v58 java.util.List)
      (r89v59 java.util.List)
      (r89v60 java.util.List)
      (r89v61 java.util.List)
      (r89v62 java.util.List)
      (r89v63 java.util.List)
      (r89v64 java.util.List)
      (r89v65 java.util.List)
      (r89v66 java.util.List)
      (r89v67 java.util.List)
      (r89v68 java.util.List)
      (r89v69 java.util.List)
      (r89v70 java.util.List)
      (r89v71 java.util.List)
      (r89v72 java.util.List)
      (r89v73 java.util.List)
      (r89v74 java.util.List)
      (r89v75 java.util.List)
      (r89v76 java.util.List)
      (r89v77 java.util.List)
      (r89v78 java.util.List)
      (r89v79 java.util.List)
      (r89v80 java.util.List)
      (r89v81 java.util.List)
      (r89v82 java.util.List)
      (r89v83 java.util.List)
      (r89v84 java.util.List)
      (r89v85 java.util.List)
      (r89v88 java.util.List)
     binds: [B:265:0x06e0, B:262:0x06cf, B:259:0x06be, B:256:0x06ad, B:253:0x069c, B:250:0x068b, B:247:0x0679, B:244:0x0667, B:241:0x0655, B:238:0x0643, B:235:0x0631, B:232:0x061f, B:229:0x060d, B:226:0x05fb, B:223:0x05e9, B:220:0x05d7, B:217:0x05c5, B:214:0x05b3, B:211:0x05a1, B:208:0x058f, B:205:0x057d, B:202:0x056b, B:199:0x0559, B:196:0x0547, B:193:0x0535, B:190:0x0523, B:187:0x0511, B:184:0x0500, B:181:0x04ee, B:178:0x04dc, B:175:0x04ca, B:172:0x04b8, B:169:0x04a6, B:166:0x0494, B:163:0x0482, B:160:0x0471, B:157:0x045f, B:154:0x044d, B:151:0x043b, B:148:0x042a, B:145:0x0418, B:142:0x0406, B:139:0x03f4, B:136:0x03e2, B:133:0x03d0, B:130:0x03be, B:127:0x03ac, B:124:0x039a, B:121:0x0388, B:118:0x0376, B:115:0x0364, B:112:0x0352, B:109:0x0340, B:106:0x032e, B:103:0x031c, B:100:0x030a, B:97:0x02f9, B:94:0x02e7, B:91:0x02d5, B:88:0x02c3, B:85:0x02b1, B:82:0x029f, B:79:0x028e, B:76:0x027c, B:73:0x026a, B:70:0x0258, B:67:0x0246, B:64:0x0234, B:61:0x0222, B:58:0x0210, B:55:0x01fe, B:52:0x01ec, B:49:0x01da, B:46:0x01c8, B:43:0x01b6, B:40:0x01a5, B:37:0x0193, B:34:0x0182, B:31:0x0170, B:28:0x015f, B:25:0x014d, B:22:0x013b, B:19:0x0129, B:16:0x0117, B:13:0x0105, B:11:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    zzfcj(JsonReader jsonReader) throws IOException {
        List list;
        List listM17475b;
        byte b7;
        List listM17475b2 = Collections.EMPTY_LIST;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzgjz.zzi();
        zzgjz zzgjzVarZzi = zzgjz.zzi();
        HashMap map = new HashMap();
        zzgjz zzgjzVarZzi2 = zzgjz.zzi();
        zzgjz zzgjzVarZzi3 = zzgjz.zzi();
        jsonReader.beginObject();
        List listZza = listM17475b2;
        List listM17475b3 = listZza;
        List listZza2 = listM17475b3;
        List listM17475b4 = listZza2;
        JSONObject jSONObjectM17477d = jSONObject;
        JSONObject jSONObjectM17477d2 = jSONObject2;
        JSONObject jSONObjectM17477d3 = jSONObject3;
        JSONObject jSONObjectM17477d4 = jSONObject4;
        JSONObject jSONObjectM17477d5 = jSONObject5;
        JSONObject jSONObjectM17477d6 = jSONObject6;
        List listM17475b5 = zzgjzVarZzi;
        Map mapM17476c = map;
        List listM17475b6 = zzgjzVarZzi2;
        zzgjz zzgjzVarZza = zzgjzVarZzi3;
        double dNextDouble = 0.0d;
        zzbvt zzbvtVarZza = null;
        zzbxc zzbxcVarZza = null;
        zzbtc zzbtcVarZza = null;
        C3377o2 c3377o2M17292T = null;
        String strNextString = null;
        C7606w c7606wM33344b = null;
        AbstractC7607x abstractC7607xM33346d = null;
        zzfco zzfcoVar = null;
        String strNextString2 = "";
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        String strNextString6 = strNextString5;
        String string = strNextString6;
        String strNextString7 = string;
        String strNextString8 = strNextString7;
        String strNextString9 = strNextString8;
        String strNextString10 = strNextString9;
        String strNextString11 = strNextString10;
        String strNextString12 = strNextString11;
        String strNextString13 = strNextString12;
        String strNextString14 = strNextString13;
        String strNextString15 = strNextString14;
        String strNextString16 = strNextString15;
        String strNextString17 = strNextString16;
        String strNextString18 = strNextString17;
        String strNextString19 = strNextString18;
        String strNextString20 = strNextString19;
        int iZzd = 0;
        int iZzc = 0;
        int iNextInt = 0;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        boolean zNextBoolean3 = false;
        boolean zNextBoolean4 = false;
        boolean zNextBoolean5 = false;
        boolean zNextBoolean6 = false;
        boolean zNextBoolean7 = false;
        int iZze = -1;
        int iNextInt2 = 0;
        boolean zNextBoolean8 = false;
        boolean zNextBoolean9 = false;
        boolean zNextBoolean10 = false;
        int iNextInt3 = 0;
        int iNextInt4 = -1;
        boolean zNextBoolean11 = false;
        boolean zNextBoolean12 = false;
        boolean zNextBoolean13 = false;
        boolean zNextBoolean14 = false;
        boolean zNextBoolean15 = false;
        boolean zNextBoolean16 = false;
        boolean zNextBoolean17 = false;
        boolean zNextBoolean18 = false;
        int iNextInt5 = 0;
        boolean zNextBoolean19 = false;
        boolean zNextBoolean20 = false;
        boolean zNextBoolean21 = false;
        int iNextInt6 = -1;
        List listM17475b7 = listM17475b4;
        List listM17475b8 = listM17475b7;
        List listM17475b9 = listM17475b8;
        List listM17475b10 = listM17475b9;
        List listM17475b11 = listM17475b10;
        List listM17475b12 = listM17475b11;
        List listM17475b13 = listM17475b12;
        List listM17475b14 = listM17475b13;
        List list2 = listM17475b14;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            String str = strNextName == null ? "" : strNextName;
            switch (str.hashCode()) {
                case -2138196627:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("ad_source_instance_name")) {
                        b7 = -1;
                    } else {
                        b7 = 59;
                    }
                    break;
                case -1980587809:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("debug_signals")) {
                        b7 = -1;
                    } else {
                        b7 = 28;
                    }
                    break;
                case -1965512151:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("omid_settings")) {
                        b7 = -1;
                    } else {
                        b7 = 41;
                    }
                    break;
                case -1964744830:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("offline_ad_config")) {
                        b7 = -1;
                    } else {
                        b7 = 79;
                    }
                    break;
                case -1871425831:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("recursive_server_response_data")) {
                        b7 = -1;
                    } else {
                        b7 = 69;
                    }
                    break;
                case -1843156475:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("is_consent")) {
                        b7 = -1;
                    } else {
                        b7 = 71;
                    }
                    break;
                case -1840512279:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("presentation_urls")) {
                        b7 = -1;
                    } else {
                        b7 = 81;
                    }
                    break;
                case -1828733410:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("network_ping_config")) {
                        b7 = -1;
                    } else {
                        b7 = 78;
                    }
                    break;
                case -1812055556:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("play_prewarm_options")) {
                        b7 = -1;
                    } else {
                        b7 = 49;
                    }
                    break;
                case -1785028569:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("parallel_key")) {
                        b7 = -1;
                    } else {
                        b7 = 73;
                    }
                    break;
                case -1776946669:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("ad_source_name")) {
                        b7 = -1;
                    } else {
                        b7 = 57;
                    }
                    break;
                case -1662989631:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("is_interscroller")) {
                        b7 = -1;
                    } else {
                        b7 = 53;
                    }
                    break;
                case -1620470467:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("backend_query_id")) {
                        b7 = -1;
                    } else {
                        b7 = 47;
                    }
                    break;
                case -1550155393:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("nofill_urls")) {
                        b7 = -1;
                    } else {
                        b7 = 13;
                    }
                    break;
                case -1440104884:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("is_custom_close_blocked")) {
                        b7 = -1;
                    } else {
                        b7 = 35;
                    }
                    break;
                case -1439500848:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("orientation")) {
                        b7 = -1;
                    } else {
                        b7 = 37;
                    }
                    break;
                case -1428969291:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("enable_omid")) {
                        b7 = -1;
                    } else {
                        b7 = 39;
                    }
                    break;
                case -1406227629:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("buffer_click_url_as_ready_to_ping")) {
                        b7 = -1;
                    } else {
                        b7 = 67;
                    }
                    break;
                case -1403779768:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("showable_impression_type")) {
                        b7 = -1;
                    } else {
                        b7 = 44;
                    }
                    break;
                case -1375413093:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("ad_cover")) {
                        b7 = -1;
                    } else {
                        b7 = 54;
                    }
                    break;
                case -1360811658:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("ad_sizes")) {
                        b7 = -1;
                    } else {
                        b7 = 19;
                    }
                    break;
                case -1306015996:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("adapters")) {
                        b7 = -1;
                    } else {
                        b7 = 20;
                    }
                    break;
                case -1303332046:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("test_mode_enabled")) {
                        b7 = -1;
                    } else {
                        b7 = 34;
                    }
                    break;
                case -1289032093:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("extras")) {
                        b7 = -1;
                    } else {
                        b7 = 29;
                    }
                    break;
                case -1240082064:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("ad_event_value")) {
                        b7 = -1;
                    } else {
                        b7 = 51;
                    }
                    break;
                case -1234181075:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("allow_pub_rendered_attribution")) {
                        b7 = -1;
                    } else {
                        b7 = 30;
                    }
                    break;
                case -1168140544:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("presentation_error_urls")) {
                        b7 = -1;
                    } else {
                        b7 = 14;
                    }
                    break;
                case -1152230954:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("ad_type")) {
                        b7 = -1;
                    } else {
                        b7 = 1;
                    }
                    break;
                case -1146534047:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("is_scroll_aware")) {
                        b7 = -1;
                    } else {
                        b7 = 43;
                    }
                    break;
                case -1115838944:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("fill_urls")) {
                        b7 = -1;
                    } else {
                        b7 = 12;
                    }
                    break;
                case -1081936678:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("allocation_id")) {
                        b7 = -1;
                    } else {
                        b7 = 21;
                    }
                    break;
                case -1078050970:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("video_complete_urls")) {
                        b7 = -1;
                    } else {
                        b7 = 8;
                    }
                    break;
                case -1051269058:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("active_view")) {
                        b7 = -1;
                    } else {
                        b7 = 25;
                    }
                    break;
                case -982608540:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("valid_from_timestamp")) {
                        b7 = -1;
                    } else {
                        b7 = 10;
                    }
                    break;
                case -972056451:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("ad_source_instance_id")) {
                        b7 = -1;
                    } else {
                        b7 = 60;
                    }
                    break;
                case -776859333:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("click_urls")) {
                        b7 = -1;
                    } else {
                        b7 = 2;
                    }
                    break;
                case -652881372:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("on_device_storage_configs")) {
                        b7 = -1;
                    } else {
                        b7 = 83;
                    }
                    break;
                case -570101180:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("late_load_urls")) {
                        b7 = -1;
                    } else {
                        b7 = 74;
                    }
                    break;
                case -544216775:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("safe_browsing")) {
                        b7 = -1;
                    } else {
                        b7 = 26;
                    }
                    break;
                case -437057161:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("imp_urls")) {
                        b7 = -1;
                    } else {
                        b7 = 3;
                    }
                    break;
                case -404433734:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("rtb_native_required_assets")) {
                        b7 = -1;
                    } else {
                        b7 = 62;
                    }
                    break;
                case -404326515:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("render_timeout_ms")) {
                        b7 = -1;
                    } else {
                        b7 = 38;
                    }
                    break;
                case -397704715:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("ad_close_time_ms")) {
                        b7 = -1;
                    } else {
                        b7 = 45;
                    }
                    break;
                case -388807511:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("content_url")) {
                        b7 = -1;
                    } else {
                        b7 = 64;
                    }
                    break;
                case -369773488:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("is_close_button_enabled")) {
                        b7 = -1;
                    } else {
                        b7 = 50;
                    }
                    break;
                case -213449460:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("force_disable_hardware_acceleration")) {
                        b7 = -1;
                    } else {
                        b7 = 65;
                    }
                    break;
                case -213424028:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("watermark")) {
                        b7 = -1;
                    } else {
                        b7 = 46;
                    }
                    break;
                case -180214626:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("native_required_asset_viewability")) {
                        b7 = -1;
                    } else {
                        b7 = 63;
                    }
                    break;
                case -154616268:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("is_offline_ad")) {
                        b7 = -1;
                    } else {
                        b7 = 61;
                    }
                    break;
                case -29338502:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("allow_custom_click_gesture")) {
                        b7 = -1;
                    } else {
                        b7 = 32;
                    }
                    break;
                case 3107:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("ad")) {
                        b7 = -1;
                    } else {
                        b7 = 18;
                    }
                    break;
                case 3355:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("id")) {
                        b7 = -1;
                    } else {
                        b7 = 23;
                    }
                    break;
                case 3076010:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("data")) {
                        b7 = -1;
                    } else {
                        b7 = 22;
                    }
                    break;
                case 37109963:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("request_id")) {
                        b7 = -1;
                    } else {
                        b7 = 68;
                    }
                    break;
                case 63195984:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("render_test_label")) {
                        b7 = -1;
                    } else {
                        b7 = 33;
                    }
                    break;
                case 107433883:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("qdata")) {
                        b7 = -1;
                    } else {
                        b7 = 24;
                    }
                    break;
                case 230323073:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("ad_load_urls")) {
                        b7 = -1;
                    } else {
                        b7 = 4;
                    }
                    break;
                case 418392395:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("is_closable_area_disabled")) {
                        b7 = -1;
                    } else {
                        b7 = 36;
                    }
                    break;
                case 542250332:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("consent_form_action_identifier")) {
                        b7 = -1;
                    } else {
                        b7 = 72;
                    }
                    break;
                case 549176928:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("presentation_error_timeout_ms")) {
                        b7 = -1;
                    } else {
                        b7 = 16;
                    }
                    break;
                case 597473788:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("debug_dialog_string")) {
                        b7 = -1;
                    } else {
                        b7 = 27;
                    }
                    break;
                case 754887508:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("container_sizes")) {
                        b7 = -1;
                    } else {
                        b7 = 17;
                    }
                    break;
                case 791122864:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("impression_type")) {
                        b7 = -1;
                    } else {
                        b7 = 5;
                    }
                    break;
                case 805095541:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("analytics_event_name_to_parameters_map")) {
                        b7 = -1;
                    } else {
                        b7 = 77;
                    }
                    break;
                case 1010584092:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("transaction_id")) {
                        b7 = -1;
                    } else {
                        b7 = 9;
                    }
                    break;
                case 1100650276:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("rewards")) {
                        b7 = -1;
                    } else {
                        b7 = 11;
                    }
                    break;
                case 1141602460:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("adapter_response_info_key")) {
                        b7 = -1;
                    } else {
                        b7 = 56;
                    }
                    break;
                case 1186014765:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("cache_hit_urls")) {
                        b7 = -1;
                    } else {
                        b7 = 66;
                    }
                    break;
                case 1303622534:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("preload_sort_value")) {
                        b7 = -1;
                    } else {
                        b7 = 76;
                    }
                    break;
                case 1321720943:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("allow_pub_owned_ad_view")) {
                        b7 = -1;
                    } else {
                        b7 = 31;
                    }
                    break;
                case 1422388341:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("is_collapsible")) {
                        b7 = -1;
                    } else {
                        b7 = 70;
                    }
                    break;
                case 1437255331:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("ad_source_id")) {
                        b7 = -1;
                    } else {
                        b7 = 58;
                    }
                    break;
                case 1556932485:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("post_click_lifecycle_monitoring_duration_ms")) {
                        b7 = -1;
                    } else {
                        b7 = 80;
                    }
                    break;
                case 1565514205:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("adapter_only_third_party_impression")) {
                        b7 = -1;
                    } else {
                        b7 = 84;
                    }
                    break;
                case 1637553475:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("bid_response")) {
                        b7 = -1;
                    } else {
                        b7 = 40;
                    }
                    break;
                case 1638957285:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("video_start_urls")) {
                        b7 = -1;
                    } else {
                        b7 = 6;
                    }
                    break;
                case 1686319423:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("ad_network_class_name")) {
                        b7 = -1;
                    } else {
                        b7 = 55;
                    }
                    break;
                case 1688341040:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("video_reward_urls")) {
                        b7 = -1;
                    } else {
                        b7 = 7;
                    }
                    break;
                case 1799285870:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("use_third_party_container_height")) {
                        b7 = -1;
                    } else {
                        b7 = 48;
                    }
                    break;
                case 1839650832:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("renderers")) {
                        b7 = -1;
                    } else {
                        b7 = 0;
                    }
                    break;
                case 1875425491:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("is_analytics_logging_enabled")) {
                        b7 = -1;
                    } else {
                        b7 = 42;
                    }
                    break;
                case 2068142375:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("rule_line_external_id")) {
                        b7 = -1;
                    } else {
                        b7 = 52;
                    }
                    break;
                case 2072888499:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("manual_tracking_urls")) {
                        b7 = -1;
                    } else {
                        b7 = 15;
                    }
                    break;
                case 2075506442:
                    list = listM17475b14;
                    listM17475b = list2;
                    if (!str.equals("render_serially")) {
                        b7 = -1;
                    } else {
                        b7 = 75;
                    }
                    break;
                case 2117205836:
                    listM17475b = list2;
                    list = listM17475b14;
                    if (!str.equals("flow_control")) {
                        b7 = -1;
                    } else {
                        b7 = 82;
                    }
                    break;
                default:
                    list = listM17475b14;
                    listM17475b = list2;
                    b7 = -1;
                    break;
            }
            switch (b7) {
                case 0:
                    listM17475b2 = AbstractC3453S.m17475b(jsonReader);
                    listM17475b14 = list;
                    break;
                case 1:
                    iZzc = zzc(jsonReader.nextString());
                    listM17475b14 = list;
                    break;
                case 2:
                    listM17475b7 = AbstractC3453S.m17475b(jsonReader);
                    listM17475b14 = list;
                    break;
                case 3:
                    listM17475b8 = AbstractC3453S.m17475b(jsonReader);
                    listM17475b14 = list;
                    break;
                case 4:
                    listM17475b9 = AbstractC3453S.m17475b(jsonReader);
                    listM17475b14 = list;
                    break;
                case 5:
                    iZzd = zzd(jsonReader.nextInt());
                    listM17475b14 = list;
                    break;
                case 6:
                    listM17475b10 = AbstractC3453S.m17475b(jsonReader);
                    listM17475b14 = list;
                    break;
                case 7:
                    listM17475b11 = AbstractC3453S.m17475b(jsonReader);
                    listM17475b14 = list;
                    break;
                case 8:
                    listM17475b12 = AbstractC3453S.m17475b(jsonReader);
                    listM17475b14 = list;
                    break;
                case 9:
                    strNextString3 = jsonReader.nextString();
                    listM17475b14 = list;
                    break;
                case 10:
                    strNextString2 = jsonReader.nextString();
                    listM17475b14 = list;
                    break;
                case 11:
                    zzbvtVarZza = zzbvt.zza(AbstractC3453S.m17478e(jsonReader));
                    listM17475b14 = list;
                    break;
                case 12:
                    listM17475b13 = AbstractC3453S.m17475b(jsonReader);
                    listM17475b14 = list;
                    break;
                case 13:
                    listM17475b14 = AbstractC3453S.m17475b(jsonReader);
                    break;
                case 14:
                    listM17475b = AbstractC3453S.m17475b(jsonReader);
                    listM17475b14 = list;
                    break;
                case 15:
                    listM17475b4 = AbstractC3453S.m17475b(jsonReader);
                    listM17475b14 = list;
                    break;
                case 16:
                    iNextInt = jsonReader.nextInt();
                    listM17475b14 = list;
                    break;
                case 17:
                    listZza2 = zzfck.zza(jsonReader);
                    listM17475b14 = list;
                    break;
                case 18:
                    zzfcoVar = new zzfco(jsonReader);
                    listM17475b14 = list;
                    break;
                case 19:
                    listZza = zzfck.zza(jsonReader);
                    listM17475b14 = list;
                    break;
                case 20:
                    listM17475b3 = AbstractC3453S.m17475b(jsonReader);
                    listM17475b14 = list;
                    break;
                case zzbbn.zzt.zzm /* 21 */:
                    strNextString4 = jsonReader.nextString();
                    listM17475b14 = list;
                    break;
                case 22:
                    jSONObjectM17477d = AbstractC3453S.m17477d(jsonReader);
                    listM17475b14 = list;
                    break;
                case 23:
                    strNextString5 = jsonReader.nextString();
                    listM17475b14 = list;
                    break;
                case 24:
                    strNextString6 = jsonReader.nextString();
                    listM17475b14 = list;
                    break;
                case 25:
                    string = AbstractC3453S.m17477d(jsonReader).toString();
                    listM17475b14 = list;
                    break;
                case 26:
                    zzbxcVarZza = zzbxc.zza(AbstractC3453S.m17477d(jsonReader));
                    listM17475b14 = list;
                    break;
                case 27:
                    strNextString7 = jsonReader.nextString();
                    listM17475b14 = list;
                    break;
                case 28:
                    jSONObjectM17477d2 = AbstractC3453S.m17477d(jsonReader);
                    listM17475b14 = list;
                    break;
                case 29:
                    jSONObjectM17477d3 = AbstractC3453S.m17477d(jsonReader);
                    listM17475b14 = list;
                    break;
                case 30:
                    zNextBoolean = jsonReader.nextBoolean();
                    listM17475b14 = list;
                    break;
                case 31:
                    zNextBoolean2 = jsonReader.nextBoolean();
                    listM17475b14 = list;
                    break;
                case 32:
                    zNextBoolean3 = jsonReader.nextBoolean();
                    listM17475b14 = list;
                    break;
                case 33:
                    zNextBoolean4 = jsonReader.nextBoolean();
                    listM17475b14 = list;
                    break;
                case 34:
                    zNextBoolean5 = jsonReader.nextBoolean();
                    listM17475b14 = list;
                    break;
                case 35:
                    zNextBoolean6 = jsonReader.nextBoolean();
                    listM17475b14 = list;
                    break;
                case 36:
                    zNextBoolean7 = jsonReader.nextBoolean();
                    listM17475b14 = list;
                    break;
                case 37:
                    iZze = zze(jsonReader.nextString());
                    listM17475b14 = list;
                    break;
                case 38:
                    iNextInt2 = jsonReader.nextInt();
                    listM17475b14 = list;
                    break;
                case 39:
                    zNextBoolean8 = jsonReader.nextBoolean();
                    listM17475b14 = list;
                    break;
                case 40:
                    strNextString8 = jsonReader.nextString();
                    listM17475b14 = list;
                    break;
                case 41:
                    jSONObjectM17477d4 = AbstractC3453S.m17477d(jsonReader);
                    listM17475b14 = list;
                    break;
                case 42:
                    zNextBoolean9 = jsonReader.nextBoolean();
                    listM17475b14 = list;
                    break;
                case 43:
                    zNextBoolean10 = jsonReader.nextBoolean();
                    listM17475b14 = list;
                    break;
                case 44:
                    iNextInt3 = jsonReader.nextInt();
                    listM17475b14 = list;
                    break;
                case 45:
                    iNextInt4 = jsonReader.nextInt();
                    listM17475b14 = list;
                    break;
                case 46:
                    strNextString9 = jsonReader.nextString();
                    listM17475b14 = list;
                    break;
                case 47:
                    strNextString10 = jsonReader.nextString();
                    listM17475b14 = list;
                    break;
                case 48:
                    zNextBoolean11 = jsonReader.nextBoolean();
                    listM17475b14 = list;
                    break;
                case 49:
                    zzbtcVarZza = zzbtc.zza(AbstractC3453S.m17477d(jsonReader));
                    listM17475b14 = list;
                    break;
                case 50:
                    jsonReader.nextBoolean();
                    listM17475b14 = list;
                    break;
                case 51:
                    c3377o2M17292T = C3377o2.m17292T(AbstractC3453S.m17477d(jsonReader));
                    listM17475b14 = list;
                    break;
                case 52:
                    strNextString11 = jsonReader.nextString();
                    listM17475b14 = list;
                    break;
                case 53:
                    zNextBoolean12 = jsonReader.nextBoolean();
                    listM17475b14 = list;
                    break;
                case 54:
                    jSONObjectM17477d5 = AbstractC3453S.m17477d(jsonReader);
                    listM17475b14 = list;
                    break;
                case 55:
                    strNextString12 = jsonReader.nextString();
                    listM17475b14 = list;
                    break;
                case 56:
                    strNextString19 = jsonReader.nextString();
                    listM17475b14 = list;
                    break;
                case 57:
                    strNextString13 = jsonReader.nextString();
                    listM17475b14 = list;
                    break;
                case 58:
                    strNextString14 = jsonReader.nextString();
                    listM17475b14 = list;
                    break;
                case 59:
                    strNextString15 = jsonReader.nextString();
                    listM17475b14 = list;
                    break;
                case 60:
                    strNextString16 = jsonReader.nextString();
                    listM17475b14 = list;
                    break;
                case 61:
                    zNextBoolean13 = jsonReader.nextBoolean();
                    listM17475b14 = list;
                    break;
                case 62:
                    jSONObjectM17477d6 = AbstractC3453S.m17477d(jsonReader);
                    listM17475b14 = list;
                    break;
                case 63:
                    zNextBoolean14 = jsonReader.nextBoolean();
                    listM17475b14 = list;
                    break;
                case 64:
                    strNextString = jsonReader.nextString();
                    listM17475b14 = list;
                    break;
                case 65:
                    zNextBoolean15 = jsonReader.nextBoolean();
                    listM17475b14 = list;
                    break;
                case 66:
                    AbstractC3453S.m17475b(jsonReader);
                    listM17475b14 = list;
                    break;
                case 67:
                    zNextBoolean16 = jsonReader.nextBoolean();
                    listM17475b14 = list;
                    break;
                case 68:
                    strNextString17 = jsonReader.nextString();
                    listM17475b14 = list;
                    break;
                case 69:
                    strNextString18 = jsonReader.nextString();
                    listM17475b14 = list;
                    break;
                case 70:
                    zNextBoolean17 = jsonReader.nextBoolean();
                    listM17475b14 = list;
                    break;
                case 71:
                    zNextBoolean18 = jsonReader.nextBoolean();
                    listM17475b14 = list;
                    break;
                case 72:
                    iNextInt5 = jsonReader.nextInt();
                    listM17475b14 = list;
                    break;
                case 73:
                    strNextString20 = jsonReader.nextString();
                    listM17475b14 = list;
                    break;
                case 74:
                    listM17475b5 = AbstractC3453S.m17475b(jsonReader);
                    listM17475b14 = list;
                    break;
                case 75:
                    zNextBoolean19 = jsonReader.nextBoolean();
                    listM17475b14 = list;
                    break;
                case 76:
                    dNextDouble = jsonReader.nextDouble();
                    listM17475b14 = list;
                    break;
                case 77:
                    if (((Boolean) zzbci.zzat.zzg()).booleanValue()) {
                        mapM17476c = AbstractC3453S.m17476c(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM17475b14 = list;
                    break;
                case 78:
                    if (((Boolean) zzbci.zzjo.zzg()).booleanValue()) {
                        c7606wM33344b = C7606w.m33344b(AbstractC3453S.m17477d(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listM17475b14 = list;
                    break;
                case 79:
                    if (((Boolean) zzbci.zzjq.zzg()).booleanValue()) {
                        abstractC7607xM33346d = AbstractC7607x.m33346d(AbstractC3453S.m17477d(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listM17475b14 = list;
                    break;
                case 80:
                    if (((Boolean) zzbci.zznG.zzg()).booleanValue()) {
                        iNextInt6 = jsonReader.nextInt();
                    } else {
                        jsonReader.skipValue();
                    }
                    listM17475b14 = list;
                    break;
                case 81:
                    listM17475b6 = AbstractC3453S.m17475b(jsonReader);
                    listM17475b14 = list;
                    break;
                case 82:
                    zNextBoolean20 = jsonReader.nextBoolean();
                    listM17475b14 = list;
                    break;
                case 83:
                    if (((Boolean) zzbci.zzio.zzg()).booleanValue()) {
                        zzgjzVarZza = zzdtq.zza(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listM17475b14 = list;
                    break;
                case 84:
                    zNextBoolean21 = jsonReader.nextBoolean();
                    listM17475b14 = list;
                    break;
                default:
                    jsonReader.skipValue();
                    listM17475b14 = list;
                    break;
            }
            list2 = listM17475b;
        }
        jsonReader.endObject();
        this.zza = listM17475b2;
        this.zzb = iZzc;
        this.zzc = listM17475b7;
        this.zzd = listM17475b8;
        this.zzf = listM17475b9;
        this.zze = iZzd;
        this.zzg = listM17475b10;
        this.zzh = listM17475b11;
        this.zzi = listM17475b12;
        this.zzj = strNextString3;
        this.zzk = strNextString2;
        this.zzl = zzbvtVarZza;
        this.zzm = listM17475b13;
        this.zzn = listM17475b14;
        this.zzo = list2;
        this.zzp = listM17475b4;
        this.zzq = iNextInt;
        this.zzr = listZza2;
        this.zzs = zzfcoVar;
        this.zzt = listM17475b3;
        this.zzu = listZza;
        this.zzw = strNextString4;
        this.zzv = jSONObjectM17477d;
        this.zzx = strNextString5;
        this.zzy = strNextString6;
        this.zzz = string;
        this.zzA = zzbxcVarZza;
        this.zzB = strNextString7;
        this.zzC = jSONObjectM17477d2;
        this.zzD = jSONObjectM17477d3;
        this.zzJ = zNextBoolean;
        this.zzK = zNextBoolean2;
        this.zzL = zNextBoolean3;
        this.zzM = zNextBoolean4;
        this.zzN = zNextBoolean5;
        this.zzO = zNextBoolean6;
        this.zzP = zNextBoolean7;
        this.zzQ = iZze;
        this.zzR = iNextInt2;
        this.zzT = zNextBoolean8;
        this.zzU = strNextString8;
        this.zzV = new zzfdf(jSONObjectM17477d4);
        this.zzW = zNextBoolean9;
        this.zzX = zNextBoolean10;
        this.zzY = iNextInt3;
        this.zzZ = strNextString9;
        this.zzaa = iNextInt4;
        this.zzab = strNextString10;
        this.zzac = zNextBoolean11;
        this.zzad = zzbtcVarZza;
        this.zzae = c3377o2M17292T;
        this.zzaf = strNextString11;
        this.zzag = zNextBoolean12;
        this.zzah = jSONObjectM17477d5;
        this.zzE = strNextString12;
        this.zzF = strNextString13;
        this.zzG = strNextString14;
        this.zzH = strNextString15;
        this.zzI = strNextString16;
        this.zzai = zNextBoolean13;
        this.zzaj = jSONObjectM17477d6;
        this.zzak = zNextBoolean14;
        this.zzal = strNextString;
        this.zzam = zNextBoolean15;
        this.zzS = zNextBoolean16;
        this.zzan = strNextString17;
        this.zzao = strNextString18;
        this.zzap = strNextString19;
        this.zzaq = zNextBoolean17;
        this.zzar = zNextBoolean18;
        this.zzas = iNextInt5;
        this.zzau = listM17475b5;
        this.zzat = strNextString20;
        this.zzav = zNextBoolean19;
        this.zzaw = mapM17476c;
        this.zzax = c7606wM33344b;
        this.zzay = abstractC7607xM33346d;
        this.zzaz = dNextDouble;
        this.zzaA = listM17475b6;
        this.zzaB = zNextBoolean20;
        this.zzaC = zzgjzVarZza;
        this.zzaD = zNextBoolean21;
        this.zzaE = iNextInt6;
    }

    public static String zza(int i7) {
        switch (i7) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzc(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzd(int i7) {
        if (i7 == 0 || i7 == 1 || i7 == 3 || i7 == 4) {
            return i7;
        }
        return 0;
    }

    private static int zze(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        return "portrait".equalsIgnoreCase(str) ? 7 : -1;
    }

    public final boolean zzb() {
        return this.zzai || this.zzay != null;
    }
}
