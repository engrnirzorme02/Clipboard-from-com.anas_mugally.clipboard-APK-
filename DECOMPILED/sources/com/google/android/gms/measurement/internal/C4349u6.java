package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfh;
import com.google.android.gms.internal.measurement.zzfl;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzha;
import com.google.android.gms.internal.measurement.zzhe;
import com.google.android.gms.internal.measurement.zzhg;
import com.google.android.gms.internal.measurement.zzhl;
import com.google.android.gms.internal.measurement.zzho;
import com.google.android.gms.internal.measurement.zzhq;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzhv;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzic;
import com.google.android.gms.internal.measurement.zzid;
import com.google.android.gms.internal.measurement.zzii;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzis;
import com.google.android.gms.internal.measurement.zzit;
import com.google.android.gms.internal.measurement.zziu;
import com.google.android.gms.internal.measurement.zzlr;
import com.google.android.gms.internal.measurement.zznl;
import com.google.android.gms.internal.measurement.zzqp;
import com.google.android.gms.internal.measurement.zzrb;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import p177X2.AbstractC1946b;
import p283k3.AbstractC6029L;
import p283k3.AbstractC6052w;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.u6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4349u6 extends AbstractC4197b6 {
    C4349u6(C4317q6 c4317q6) {
        super(c4317q6);
    }

    /* JADX INFO: renamed from: A */
    private static final String m19062A(boolean z7, boolean z8, boolean z9) {
        StringBuilder sb = new StringBuilder();
        if (z7) {
            sb.append("Dynamic ");
        }
        if (z8) {
            sb.append("Sequence ");
        }
        if (z9) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: B */
    private static final Object m19063B(zzhw zzhwVar) {
        if (zzhwVar.zzc()) {
            return zzhwVar.zzd();
        }
        if (zzhwVar.zze()) {
            return Long.valueOf(zzhwVar.zzf());
        }
        if (zzhwVar.zzi()) {
            return Double.valueOf(zzhwVar.zzj());
        }
        if (zzhwVar.zzm() > 0) {
            return m19073Y(zzhwVar.zzk());
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    private static final void m19064C(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                m19085z(builder, str3, string, set);
            }
        }
    }

    /* JADX INFO: renamed from: D */
    private static final void m19065D(StringBuilder sb, int i7, String str, zzii zziiVar) {
        if (zziiVar == null) {
            return;
        }
        m19084y(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (zziiVar.zzd() != 0) {
            m19084y(sb, 4);
            sb.append("results: ");
            int i8 = 0;
            for (Long l7 : zziiVar.zzc()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(l7);
                i8 = i9;
            }
            sb.append('\n');
        }
        if (zziiVar.zzb() != 0) {
            m19084y(sb, 4);
            sb.append("status: ");
            int i10 = 0;
            for (Long l8 : zziiVar.zza()) {
                int i11 = i10 + 1;
                if (i10 != 0) {
                    sb.append(", ");
                }
                sb.append(l8);
                i10 = i11;
            }
            sb.append('\n');
        }
        if (zziiVar.zzf() != 0) {
            m19084y(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i12 = 0;
            for (zzhq zzhqVar : zziiVar.zze()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb.append(", ");
                }
                sb.append(zzhqVar.zza() ? Integer.valueOf(zzhqVar.zzb()) : null);
                sb.append(":");
                sb.append(zzhqVar.zzc() ? Long.valueOf(zzhqVar.zzd()) : null);
                i12 = i13;
            }
            sb.append("}\n");
        }
        if (zziiVar.zzh() != 0) {
            m19084y(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i14 = 0;
            for (zzik zzikVar : zziiVar.zzg()) {
                int i15 = i14 + 1;
                if (i14 != 0) {
                    sb.append(", ");
                }
                sb.append(zzikVar.zza() ? Integer.valueOf(zzikVar.zzb()) : null);
                sb.append(": [");
                Iterator it = zzikVar.zzc().iterator();
                int i16 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i17 = i16 + 1;
                    if (i16 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i16 = i17;
                }
                sb.append("]");
                i14 = i15;
            }
            sb.append("}\n");
        }
        m19084y(sb, 3);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: E */
    private static final void m19066E(StringBuilder sb, int i7, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m19084y(sb, i7 + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    /* JADX INFO: renamed from: F */
    private static final void m19067F(StringBuilder sb, int i7, String str, zzfl zzflVar) {
        String str2;
        if (zzflVar == null) {
            return;
        }
        m19084y(sb, i7);
        sb.append(str);
        sb.append(" {\n");
        if (zzflVar.zza()) {
            int iZzm = zzflVar.zzm();
            if (iZzm == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iZzm == 2) {
                str2 = "LESS_THAN";
            } else if (iZzm != 3) {
                str2 = iZzm != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            m19066E(sb, i7, "comparison_type", str2);
        }
        if (zzflVar.zzb()) {
            m19066E(sb, i7, "match_as_float", Boolean.valueOf(zzflVar.zzc()));
        }
        if (zzflVar.zzd()) {
            m19066E(sb, i7, "comparison_value", zzflVar.zze());
        }
        if (zzflVar.zzf()) {
            m19066E(sb, i7, "min_comparison_value", zzflVar.zzg());
        }
        if (zzflVar.zzh()) {
            m19066E(sb, i7, "max_comparison_value", zzflVar.zzi());
        }
        m19084y(sb, i7);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: O */
    static boolean m19068O(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX INFO: renamed from: P */
    static boolean m19069P(List list, int i7) {
        if (i7 < list.size() * 64) {
            return ((1 << (i7 % 64)) & ((Long) list.get(i7 / 64)).longValue()) != 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: Q */
    static List m19070Q(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i7 = 0; i7 < length; i7++) {
            long j7 = 0;
            for (int i8 = 0; i8 < 64; i8++) {
                int i9 = (i7 * 64) + i8;
                if (i9 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i9)) {
                    j7 |= 1 << i8;
                }
            }
            arrayList.add(Long.valueOf(j7));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: W */
    static zznl m19071W(zznl zznlVar, byte[] bArr) {
        zzlr zzlrVarZza = zzlr.zza();
        return zzlrVarZza != null ? zznlVar.zzaV(bArr, zzlrVarZza) : zznlVar.zzaW(bArr);
    }

    /* JADX INFO: renamed from: X */
    static int m19072X(zzic zzicVar, String str) {
        for (int i7 = 0; i7 < zzicVar.zzl(); i7++) {
            if (str.equals(zzicVar.zzm(i7).zzc())) {
                return i7;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: Y */
    static Bundle[] m19073Y(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzhw zzhwVar = (zzhw) it.next();
            if (zzhwVar != null) {
                Bundle bundle = new Bundle();
                for (zzhw zzhwVar2 : zzhwVar.zzk()) {
                    if (zzhwVar2.zzc()) {
                        bundle.putString(zzhwVar2.zzb(), zzhwVar2.zzd());
                    } else if (zzhwVar2.zze()) {
                        bundle.putLong(zzhwVar2.zzb(), zzhwVar2.zzf());
                    } else if (zzhwVar2.zzi()) {
                        bundle.putDouble(zzhwVar2.zzb(), zzhwVar2.zzj());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX INFO: renamed from: o */
    static final void m19074o(zzhr zzhrVar, String str, Object obj) {
        List listZza = zzhrVar.zza();
        int i7 = 0;
        while (true) {
            if (i7 >= listZza.size()) {
                i7 = -1;
                break;
            } else if (str.equals(((zzhw) listZza.get(i7)).zzb())) {
                break;
            } else {
                i7++;
            }
        }
        zzhv zzhvVarZzn = zzhw.zzn();
        zzhvVarZzn.zzb(str);
        zzhvVarZzn.zzf(((Long) obj).longValue());
        if (i7 >= 0) {
            zzhrVar.zze(i7, zzhvVarZzn);
        } else {
            zzhrVar.zzg(zzhvVarZzn);
        }
    }

    /* JADX INFO: renamed from: p */
    static final boolean m19075p(C4039G c4039g, C4006B6 c4006b6) {
        AbstractC3718s.m18083l(c4039g);
        AbstractC3718s.m18083l(c4006b6);
        return !TextUtils.isEmpty(c4006b6.f15113b);
    }

    /* JADX INFO: renamed from: q */
    static final Bundle m19076q(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzhw zzhwVar = (zzhw) it.next();
            String strZzb = zzhwVar.zzb();
            if (zzhwVar.zzi()) {
                bundle.putDouble(strZzb, zzhwVar.zzj());
            } else if (zzhwVar.zzg()) {
                bundle.putFloat(strZzb, zzhwVar.zzh());
            } else if (zzhwVar.zzc()) {
                bundle.putString(strZzb, zzhwVar.zzd());
            } else if (zzhwVar.zze()) {
                bundle.putLong(strZzb, zzhwVar.zzf());
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: r */
    static final zzhw m19077r(zzhs zzhsVar, String str) {
        for (zzhw zzhwVar : zzhsVar.zza()) {
            if (zzhwVar.zzb().equals(str)) {
                return zzhwVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    static final Map m19078s(zzhs zzhsVar, String... strArr) {
        Object objM19063B;
        HashMap map = new HashMap();
        for (zzhw zzhwVar : zzhsVar.zza()) {
            if (Arrays.asList(strArr).contains(zzhwVar.zzb()) && (objM19063B = m19063B(zzhwVar)) != null) {
                map.put(zzhwVar.zzb(), objM19063B);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: t */
    static final Map m19079t(zzhs zzhsVar, String str) {
        Object objM19063B;
        HashMap map = new HashMap();
        for (zzhw zzhwVar : zzhsVar.zza()) {
            if (zzhwVar.zzb().startsWith("gad_") && (objM19063B = m19063B(zzhwVar)) != null) {
                map.put(zzhwVar.zzb(), objM19063B);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: u */
    static final Object m19080u(zzhs zzhsVar, String str) {
        zzhw zzhwVarM19077r = m19077r(zzhsVar, str);
        if (zzhwVarM19077r == null) {
            return null;
        }
        return m19063B(zzhwVarM19077r);
    }

    /* JADX INFO: renamed from: v */
    static final Object m19081v(zzhs zzhsVar, String str, Object obj) {
        Object objM19080u = m19080u(zzhsVar, str);
        return objM19080u == null ? obj : objM19080u;
    }

    /* JADX INFO: renamed from: w */
    private final void m19082w(StringBuilder sb, int i7, List list) {
        if (list == null) {
            return;
        }
        int i8 = i7 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzhw zzhwVar = (zzhw) it.next();
            if (zzhwVar != null) {
                m19084y(sb, i8);
                sb.append("param {\n");
                m19066E(sb, i8, "name", zzhwVar.zza() ? this.f15066a.m18662D().m18776b(zzhwVar.zzb()) : null);
                m19066E(sb, i8, "string_value", zzhwVar.zzc() ? zzhwVar.zzd() : null);
                m19066E(sb, i8, "int_value", zzhwVar.zze() ? Long.valueOf(zzhwVar.zzf()) : null);
                m19066E(sb, i8, "double_value", zzhwVar.zzi() ? Double.valueOf(zzhwVar.zzj()) : null);
                if (zzhwVar.zzm() > 0) {
                    m19082w(sb, i8, zzhwVar.zzk());
                }
                m19084y(sb, i8);
                sb.append("}\n");
            }
        }
    }

    /* JADX INFO: renamed from: x */
    private final void m19083x(StringBuilder sb, int i7, zzfh zzfhVar) {
        String str;
        if (zzfhVar == null) {
            return;
        }
        m19084y(sb, i7);
        sb.append("filter {\n");
        if (zzfhVar.zze()) {
            m19066E(sb, i7, "complement", Boolean.valueOf(zzfhVar.zzf()));
        }
        if (zzfhVar.zzg()) {
            m19066E(sb, i7, "param_name", this.f15066a.m18662D().m18776b(zzfhVar.zzh()));
        }
        if (zzfhVar.zza()) {
            int i8 = i7 + 1;
            zzfr zzfrVarZzb = zzfhVar.zzb();
            if (zzfrVarZzb != null) {
                m19084y(sb, i8);
                sb.append("string_filter {\n");
                if (zzfrVarZzb.zza()) {
                    switch (zzfrVarZzb.zzj()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    m19066E(sb, i8, "match_type", str);
                }
                if (zzfrVarZzb.zzb()) {
                    m19066E(sb, i8, "expression", zzfrVarZzb.zzc());
                }
                if (zzfrVarZzb.zzd()) {
                    m19066E(sb, i8, "case_sensitive", Boolean.valueOf(zzfrVarZzb.zze()));
                }
                if (zzfrVarZzb.zzg() > 0) {
                    m19084y(sb, i7 + 2);
                    sb.append("expression_list {\n");
                    for (String str2 : zzfrVarZzb.zzf()) {
                        m19084y(sb, i7 + 3);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                m19084y(sb, i8);
                sb.append("}\n");
            }
        }
        if (zzfhVar.zzc()) {
            m19067F(sb, i7 + 1, "number_filter", zzfhVar.zzd());
        }
        m19084y(sb, i7);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: y */
    private static final void m19084y(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            sb.append("  ");
        }
    }

    /* JADX INFO: renamed from: z */
    private static final void m19085z(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    /* JADX INFO: renamed from: G */
    final void m19086G(zzit zzitVar, Object obj) {
        AbstractC3718s.m18083l(obj);
        zzitVar.zzd();
        zzitVar.zzf();
        zzitVar.zzh();
        if (obj instanceof String) {
            zzitVar.zzc((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzitVar.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzitVar.zzg(((Double) obj).doubleValue());
        } else {
            this.f15066a.mo18421a().m18851o().m18835b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* JADX INFO: renamed from: H */
    final void m19087H(zzhv zzhvVar, Object obj) {
        AbstractC3718s.m18083l(obj);
        zzhvVar.zze();
        zzhvVar.zzg();
        zzhvVar.zzi();
        zzhvVar.zzm();
        if (obj instanceof String) {
            zzhvVar.zzd((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzhvVar.zzf(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzhvVar.zzh(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            this.f15066a.mo18421a().m18851o().m18835b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                zzhv zzhvVarZzn = zzhw.zzn();
                for (String str : bundle.keySet()) {
                    zzhv zzhvVarZzn2 = zzhw.zzn();
                    zzhvVarZzn2.zzb(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        zzhvVarZzn2.zzf(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        zzhvVarZzn2.zzd((String) obj2);
                    } else if (obj2 instanceof Double) {
                        zzhvVarZzn2.zzh(((Double) obj2).doubleValue());
                    }
                    zzhvVarZzn.zzk(zzhvVarZzn2);
                }
                if (zzhvVarZzn.zzj() > 0) {
                    arrayList.add((zzhw) zzhvVarZzn.zzbc());
                }
            }
        }
        zzhvVar.zzl(arrayList);
    }

    /* JADX INFO: renamed from: I */
    final C4132S5 m19088I(String str, zzic zzicVar, zzhr zzhrVar, String str2) {
        int iIndexOf;
        zzqp.zza();
        C4164X2 c4164x2 = this.f15066a;
        if (!c4164x2.m18686w().m18800H(str, AbstractC4209d2.f15629Q0)) {
            return null;
        }
        long jMo18159a = c4164x2.mo18425f().mo18159a();
        Set setM27048a = AbstractC6029L.m27048a(c4164x2.m18686w().m18795C(str, AbstractC4209d2.f15703v0).split(","));
        C4317q6 c4317q6 = this.f15465b;
        C4213d6 c4213d6M18893C0 = c4317q6.m18893C0();
        String strM18609x = c4213d6M18893C0.f15465b.m18895D0().m18609x(str);
        Uri.Builder builder = new Uri.Builder();
        C4164X2 c4164x3 = c4213d6M18893C0.f15066a;
        builder.scheme(c4164x3.m18686w().m18795C(str, AbstractC4209d2.f15689o0));
        if (TextUtils.isEmpty(strM18609x)) {
            builder.authority(c4164x3.m18686w().m18795C(str, AbstractC4209d2.f15691p0));
        } else {
            String strM18795C = c4164x3.m18686w().m18795C(str, AbstractC4209d2.f15691p0);
            StringBuilder sb = new StringBuilder(String.valueOf(strM18609x).length() + 1 + String.valueOf(strM18795C).length());
            sb.append(strM18609x);
            sb.append(".");
            sb.append(strM18795C);
            builder.authority(sb.toString());
        }
        builder.path(c4164x3.m18686w().m18795C(str, AbstractC4209d2.f15693q0));
        m19085z(builder, "gmp_app_id", zzicVar.zzac(), setM27048a);
        c4164x2.m18686w().m18793A();
        m19085z(builder, "gmp_version", String.valueOf(133005L), setM27048a);
        String strZzV = zzicVar.zzV();
        C4278m c4278mM18686w = c4164x2.m18686w();
        C4201c2 c4201c2 = AbstractC4209d2.f15635T0;
        if (c4278mM18686w.m18800H(str, c4201c2) && c4317q6.m18895D0().m18596N(str)) {
            strZzV = "";
        }
        m19085z(builder, "app_instance_id", strZzV, setM27048a);
        m19085z(builder, "rdid", zzicVar.zzP(), setM27048a);
        m19085z(builder, "bundle_id", zzicVar.zzK(), setM27048a);
        String strZzk = zzhrVar.zzk();
        String strM27059a = AbstractC6052w.m27059a(strZzk);
        if (true != TextUtils.isEmpty(strM27059a)) {
            strZzk = strM27059a;
        }
        m19085z(builder, "app_event_name", strZzk, setM27048a);
        m19085z(builder, "app_version", String.valueOf(zzicVar.zzai()), setM27048a);
        String strZzD = zzicVar.zzD();
        if (c4164x2.m18686w().m18800H(str, c4201c2) && c4317q6.m18895D0().m18593K(str) && !TextUtils.isEmpty(strZzD) && (iIndexOf = strZzD.indexOf(".")) != -1) {
            strZzD = strZzD.substring(0, iIndexOf);
        }
        m19085z(builder, "os_version", strZzD, setM27048a);
        m19085z(builder, "timestamp", String.valueOf(zzhrVar.zzn()), setM27048a);
        if (zzicVar.zzS()) {
            m19085z(builder, "lat", "1", setM27048a);
        }
        m19085z(builder, "privacy_sandbox_version", String.valueOf(zzicVar.zzaG()), setM27048a);
        m19085z(builder, "trigger_uri_source", "1", setM27048a);
        m19085z(builder, "trigger_uri_timestamp", String.valueOf(jMo18159a), setM27048a);
        m19085z(builder, "request_uuid", str2, setM27048a);
        List<zzhw> listZza = zzhrVar.zza();
        Bundle bundle = new Bundle();
        for (zzhw zzhwVar : listZza) {
            String strZzb = zzhwVar.zzb();
            if (zzhwVar.zzi()) {
                bundle.putString(strZzb, String.valueOf(zzhwVar.zzj()));
            } else if (zzhwVar.zzg()) {
                bundle.putString(strZzb, String.valueOf(zzhwVar.zzh()));
            } else if (zzhwVar.zzc()) {
                bundle.putString(strZzb, zzhwVar.zzd());
            } else if (zzhwVar.zze()) {
                bundle.putString(strZzb, String.valueOf(zzhwVar.zzf()));
            }
        }
        m19064C(builder, c4164x2.m18686w().m18795C(str, AbstractC4209d2.f15701u0).split("\\|"), bundle, setM27048a);
        List<zziu> listZzk = zzicVar.zzk();
        Bundle bundle2 = new Bundle();
        for (zziu zziuVar : listZzk) {
            String strZzc = zziuVar.zzc();
            if (zziuVar.zzj()) {
                bundle2.putString(strZzc, String.valueOf(zziuVar.zzk()));
            } else if (zziuVar.zzh()) {
                bundle2.putString(strZzc, String.valueOf(zziuVar.zzi()));
            } else if (zziuVar.zzd()) {
                bundle2.putString(strZzc, zziuVar.zze());
            } else if (zziuVar.zzf()) {
                bundle2.putString(strZzc, String.valueOf(zziuVar.zzg()));
            }
        }
        m19064C(builder, c4164x2.m18686w().m18795C(str, AbstractC4209d2.f15699t0).split("\\|"), bundle2, setM27048a);
        m19085z(builder, "dma", true != zzicVar.zzaC() ? "0" : "1", setM27048a);
        if (!zzicVar.zzaE().isEmpty()) {
            m19085z(builder, "dma_cps", zzicVar.zzaE(), setM27048a);
        }
        if (zzicVar.zzaK()) {
            zzha zzhaVarZzaL = zzicVar.zzaL();
            if (!zzhaVarZzaL.zzb().isEmpty()) {
                m19085z(builder, "dl_gclid", zzhaVarZzaL.zzb(), setM27048a);
            }
            if (!zzhaVarZzaL.zzd().isEmpty()) {
                m19085z(builder, "dl_gbraid", zzhaVarZzaL.zzd(), setM27048a);
            }
            if (!zzhaVarZzaL.zzf().isEmpty()) {
                m19085z(builder, "dl_gs", zzhaVarZzaL.zzf(), setM27048a);
            }
            if (zzhaVarZzaL.zzh() > 0) {
                m19085z(builder, "dl_ss_ts", String.valueOf(zzhaVarZzaL.zzh()), setM27048a);
            }
            if (!zzhaVarZzaL.zzj().isEmpty()) {
                m19085z(builder, "mr_gclid", zzhaVarZzaL.zzj(), setM27048a);
            }
            if (!zzhaVarZzaL.zzm().isEmpty()) {
                m19085z(builder, "mr_gbraid", zzhaVarZzaL.zzm(), setM27048a);
            }
            if (!zzhaVarZzaL.zzo().isEmpty()) {
                m19085z(builder, "mr_gs", zzhaVarZzaL.zzo(), setM27048a);
            }
            if (zzhaVarZzaL.zzq() > 0) {
                m19085z(builder, "mr_click_ts", String.valueOf(zzhaVarZzaL.zzq()), setM27048a);
            }
        }
        return new C4132S5(builder.build().toString(), jMo18159a, 1);
    }

    /* JADX INFO: renamed from: J */
    final zzhs m19089J(C3999B c3999b) {
        zzhr zzhrVarZzk = zzhs.zzk();
        zzhrVarZzk.zzq(c3999b.f15084e);
        C4023E c4023e = c3999b.f15085f;
        C4015D c4015d = new C4015D(c4023e);
        while (c4015d.hasNext()) {
            String next = c4015d.next();
            zzhv zzhvVarZzn = zzhw.zzn();
            zzhvVarZzn.zzb(next);
            Object objM18479T = c4023e.m18479T(next);
            AbstractC3718s.m18083l(objM18479T);
            m19087H(zzhvVarZzn, objM18479T);
            zzhrVarZzk.zzg(zzhvVarZzn);
        }
        String str = c3999b.f15082c;
        if (!TextUtils.isEmpty(str) && c4023e.m18479T("_o") == null) {
            zzhv zzhvVarZzn2 = zzhw.zzn();
            zzhvVarZzn2.zzb("_o");
            zzhvVarZzn2.zzd(str);
            zzhrVarZzk.zzf((zzhw) zzhvVarZzn2.zzbc());
        }
        return (zzhs) zzhrVarZzk.zzbc();
    }

    /* JADX INFO: renamed from: K */
    final String m19090K(zzib zzibVar) {
        String str;
        String str2;
        String str3;
        zzhe zzheVarZzat;
        if (zzibVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (zzibVar.zzf()) {
            m19066E(sb, 0, "upload_subdomain", zzibVar.zzg());
        }
        if (zzibVar.zzd()) {
            m19066E(sb, 0, "sgtm_join_id", zzibVar.zze());
        }
        for (zzid zzidVar : zzibVar.zza()) {
            if (zzidVar != null) {
                m19084y(sb, 1);
                sb.append("bundle {\n");
                if (zzidVar.zza()) {
                    m19066E(sb, 1, "protocol_version", Integer.valueOf(zzidVar.zzb()));
                }
                zzrb.zza();
                C4164X2 c4164x2 = this.f15066a;
                if (c4164x2.m18686w().m18800H(zzidVar.zzA(), AbstractC4209d2.f15623N0) && zzidVar.zzag()) {
                    m19066E(sb, 1, "session_stitching_token", zzidVar.zzah());
                }
                m19066E(sb, 1, "platform", zzidVar.zzt());
                if (zzidVar.zzC()) {
                    m19066E(sb, 1, "gmp_version", Long.valueOf(zzidVar.zzD()));
                }
                if (zzidVar.zzE()) {
                    m19066E(sb, 1, "uploading_gmp_version", Long.valueOf(zzidVar.zzF()));
                }
                if (zzidVar.zzac()) {
                    m19066E(sb, 1, "dynamite_version", Long.valueOf(zzidVar.zzad()));
                }
                if (zzidVar.zzW()) {
                    m19066E(sb, 1, "config_version", Long.valueOf(zzidVar.zzX()));
                }
                m19066E(sb, 1, "gmp_app_id", zzidVar.zzP());
                m19066E(sb, 1, "app_id", zzidVar.zzA());
                m19066E(sb, 1, "app_version", zzidVar.zzB());
                if (zzidVar.zzU()) {
                    m19066E(sb, 1, "app_version_major", Integer.valueOf(zzidVar.zzV()));
                }
                m19066E(sb, 1, "firebase_instance_id", zzidVar.zzT());
                if (zzidVar.zzK()) {
                    m19066E(sb, 1, "dev_cert_hash", Long.valueOf(zzidVar.zzL()));
                }
                m19066E(sb, 1, "app_store", zzidVar.zzz());
                if (zzidVar.zzi()) {
                    m19066E(sb, 1, "upload_timestamp_millis", Long.valueOf(zzidVar.zzj()));
                }
                if (zzidVar.zzk()) {
                    m19066E(sb, 1, "start_timestamp_millis", Long.valueOf(zzidVar.zzm()));
                }
                if (zzidVar.zzn()) {
                    m19066E(sb, 1, "end_timestamp_millis", Long.valueOf(zzidVar.zzo()));
                }
                if (zzidVar.zzp()) {
                    m19066E(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzidVar.zzq()));
                }
                if (zzidVar.zzr()) {
                    m19066E(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzidVar.zzs()));
                }
                m19066E(sb, 1, "app_instance_id", zzidVar.zzJ());
                m19066E(sb, 1, "resettable_device_id", zzidVar.zzG());
                m19066E(sb, 1, "ds_id", zzidVar.zzZ());
                if (zzidVar.zzH()) {
                    m19066E(sb, 1, "limited_ad_tracking", Boolean.valueOf(zzidVar.zzI()));
                }
                m19066E(sb, 1, "os_version", zzidVar.zzu());
                m19066E(sb, 1, "device_model", zzidVar.zzv());
                m19066E(sb, 1, "user_default_language", zzidVar.zzw());
                if (zzidVar.zzx()) {
                    m19066E(sb, 1, "time_zone_offset_minutes", Integer.valueOf(zzidVar.zzy()));
                }
                if (zzidVar.zzM()) {
                    m19066E(sb, 1, "bundle_sequential_index", Integer.valueOf(zzidVar.zzN()));
                }
                if (zzidVar.zzau()) {
                    m19066E(sb, 1, "delivery_index", Integer.valueOf(zzidVar.zzav()));
                }
                if (zzidVar.zzQ()) {
                    m19066E(sb, 1, "service_upload", Boolean.valueOf(zzidVar.zzR()));
                }
                m19066E(sb, 1, "health_monitor", zzidVar.zzO());
                if (zzidVar.zzaa()) {
                    m19066E(sb, 1, "retry_counter", Integer.valueOf(zzidVar.zzab()));
                }
                if (zzidVar.zzae()) {
                    m19066E(sb, 1, "consent_signals", zzidVar.zzaf());
                }
                if (zzidVar.zzan()) {
                    m19066E(sb, 1, "is_dma_region", Boolean.valueOf(zzidVar.zzao()));
                }
                if (zzidVar.zzap()) {
                    m19066E(sb, 1, "core_platform_services", zzidVar.zzaq());
                }
                if (zzidVar.zzal()) {
                    m19066E(sb, 1, "consent_diagnostics", zzidVar.zzam());
                }
                if (zzidVar.zzai()) {
                    m19066E(sb, 1, "target_os_version", Long.valueOf(zzidVar.zzaj()));
                }
                zzqp.zza();
                if (c4164x2.m18686w().m18800H(zzidVar.zzA(), AbstractC4209d2.f15629Q0)) {
                    m19066E(sb, 1, "ad_services_version", Integer.valueOf(zzidVar.zzar()));
                    if (zzidVar.zzas() && (zzheVarZzat = zzidVar.zzat()) != null) {
                        m19084y(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        m19066E(sb, 2, "eligible", Boolean.valueOf(zzheVarZzat.zza()));
                        m19066E(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(zzheVarZzat.zzb()));
                        m19066E(sb, 2, "pre_r", Boolean.valueOf(zzheVarZzat.zzc()));
                        m19066E(sb, 2, "r_extensions_too_old", Boolean.valueOf(zzheVarZzat.zzd()));
                        m19066E(sb, 2, "adservices_extension_too_old", Boolean.valueOf(zzheVarZzat.zze()));
                        m19066E(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(zzheVarZzat.zzf()));
                        m19066E(sb, 2, "measurement_manager_disabled", Boolean.valueOf(zzheVarZzat.zzg()));
                        m19084y(sb, 2);
                        sb.append("}\n");
                    }
                }
                if (zzidVar.zzaw()) {
                    zzha zzhaVarZzax = zzidVar.zzax();
                    m19084y(sb, 2);
                    sb.append("ad_campaign_info {\n");
                    if (zzhaVarZzax.zza()) {
                        m19066E(sb, 2, "deep_link_gclid", zzhaVarZzax.zzb());
                    }
                    if (zzhaVarZzax.zzc()) {
                        m19066E(sb, 2, "deep_link_gbraid", zzhaVarZzax.zzd());
                    }
                    if (zzhaVarZzax.zze()) {
                        m19066E(sb, 2, "deep_link_gad_source", zzhaVarZzax.zzf());
                    }
                    if (zzhaVarZzax.zzg()) {
                        m19066E(sb, 2, "deep_link_session_millis", Long.valueOf(zzhaVarZzax.zzh()));
                    }
                    if (zzhaVarZzax.zzi()) {
                        m19066E(sb, 2, "market_referrer_gclid", zzhaVarZzax.zzj());
                    }
                    if (zzhaVarZzax.zzk()) {
                        m19066E(sb, 2, "market_referrer_gbraid", zzhaVarZzax.zzm());
                    }
                    if (zzhaVarZzax.zzn()) {
                        m19066E(sb, 2, "market_referrer_gad_source", zzhaVarZzax.zzo());
                    }
                    if (zzhaVarZzax.zzp()) {
                        m19066E(sb, 2, "market_referrer_click_millis", Long.valueOf(zzhaVarZzax.zzq()));
                    }
                    m19084y(sb, 2);
                    sb.append("}\n");
                }
                if (zzidVar.zzaA()) {
                    m19066E(sb, 1, "batching_timestamp_millis", Long.valueOf(zzidVar.zzaB()));
                }
                if (zzidVar.zzay()) {
                    zzis zzisVarZzaz = zzidVar.zzaz();
                    m19084y(sb, 2);
                    sb.append("sgtm_diagnostics {\n");
                    int iZzf = zzisVarZzaz.zzf();
                    if (iZzf == 1) {
                        str2 = "UPLOAD_TYPE_UNKNOWN";
                    } else if (iZzf == 2) {
                        str2 = "GA_UPLOAD";
                    } else if (iZzf != 3) {
                        str2 = iZzf != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD";
                    } else {
                        str2 = "SDK_CLIENT_UPLOAD";
                    }
                    m19066E(sb, 2, "upload_type", str2);
                    m19066E(sb, 2, "client_upload_eligibility", zzisVarZzaz.zza().name());
                    int iZzg = zzisVarZzaz.zzg();
                    if (iZzg == 1) {
                        str3 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    } else if (iZzg == 2) {
                        str3 = "SERVICE_UPLOAD_ELIGIBLE";
                    } else if (iZzg == 3) {
                        str3 = "NOT_IN_ROLLOUT";
                    } else if (iZzg != 4) {
                        str3 = iZzg != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO";
                    } else {
                        str3 = "MISSING_SGTM_SETTINGS";
                    }
                    m19066E(sb, 2, "service_upload_eligibility", str3);
                    m19084y(sb, 2);
                    sb.append("}\n");
                }
                if (zzidVar.zzaC()) {
                    zzho zzhoVarZzaD = zzidVar.zzaD();
                    m19084y(sb, 2);
                    sb.append("consent_info_extra {\n");
                    for (zzhl zzhlVar : zzhoVarZzaD.zza()) {
                        m19084y(sb, 3);
                        sb.append("limited_data_modes {\n");
                        int iZzc = zzhlVar.zzc();
                        if (iZzc == 1) {
                            str = "CONSENT_TYPE_UNSPECIFIED";
                        } else if (iZzc == 2) {
                            str = "AD_STORAGE";
                        } else if (iZzc != 3) {
                            str = iZzc != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA";
                        } else {
                            str = "ANALYTICS_STORAGE";
                        }
                        m19066E(sb, 3, "type", str);
                        int iZzd = zzhlVar.zzd();
                        m19066E(sb, 3, "mode", iZzd != 1 ? iZzd != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        m19084y(sb, 3);
                        sb.append("}\n");
                    }
                    m19084y(sb, 2);
                    sb.append("}\n");
                }
                List<zziu> listZzf = zzidVar.zzf();
                if (listZzf != null) {
                    for (zziu zziuVar : listZzf) {
                        if (zziuVar != null) {
                            m19084y(sb, 2);
                            sb.append("user_property {\n");
                            m19066E(sb, 2, "set_timestamp_millis", zziuVar.zza() ? Long.valueOf(zziuVar.zzb()) : null);
                            m19066E(sb, 2, "name", c4164x2.m18662D().m18777c(zziuVar.zzc()));
                            m19066E(sb, 2, "string_value", zziuVar.zze());
                            m19066E(sb, 2, "int_value", zziuVar.zzf() ? Long.valueOf(zziuVar.zzg()) : null);
                            m19066E(sb, 2, "double_value", zziuVar.zzj() ? Double.valueOf(zziuVar.zzk()) : null);
                            m19084y(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzhg> listZzS = zzidVar.zzS();
                if (listZzS != null) {
                    for (zzhg zzhgVar : listZzS) {
                        if (zzhgVar != null) {
                            m19084y(sb, 2);
                            sb.append("audience_membership {\n");
                            if (zzhgVar.zza()) {
                                m19066E(sb, 2, "audience_id", Integer.valueOf(zzhgVar.zzb()));
                            }
                            if (zzhgVar.zzf()) {
                                m19066E(sb, 2, "new_audience", Boolean.valueOf(zzhgVar.zzg()));
                            }
                            m19065D(sb, 2, "current_data", zzhgVar.zzc());
                            if (zzhgVar.zzd()) {
                                m19065D(sb, 2, "previous_data", zzhgVar.zze());
                            }
                            m19084y(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzhs> listZzc = zzidVar.zzc();
                if (listZzc != null) {
                    for (zzhs zzhsVar : listZzc) {
                        if (zzhsVar != null) {
                            m19084y(sb, 2);
                            sb.append("event {\n");
                            m19066E(sb, 2, "name", c4164x2.m18662D().m18775a(zzhsVar.zzd()));
                            if (zzhsVar.zze()) {
                                m19066E(sb, 2, "timestamp_millis", Long.valueOf(zzhsVar.zzf()));
                            }
                            if (zzhsVar.zzg()) {
                                m19066E(sb, 2, "previous_timestamp_millis", Long.valueOf(zzhsVar.zzh()));
                            }
                            if (zzhsVar.zzi()) {
                                m19066E(sb, 2, "count", Integer.valueOf(zzhsVar.zzj()));
                            }
                            if (zzhsVar.zzb() != 0) {
                                m19082w(sb, 2, zzhsVar.zza());
                            }
                            m19084y(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                m19084y(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    /* JADX INFO: renamed from: L */
    final String m19091L(zzff zzffVar) {
        if (zzffVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (zzffVar.zza()) {
            m19066E(sb, 0, "filter_id", Integer.valueOf(zzffVar.zzb()));
        }
        m19066E(sb, 0, "event_name", this.f15066a.m18662D().m18775a(zzffVar.zzc()));
        String strM19062A = m19062A(zzffVar.zzi(), zzffVar.zzj(), zzffVar.zzm());
        if (!strM19062A.isEmpty()) {
            m19066E(sb, 0, "filter_type", strM19062A);
        }
        if (zzffVar.zzg()) {
            m19067F(sb, 1, "event_count_filter", zzffVar.zzh());
        }
        if (zzffVar.zze() > 0) {
            sb.append("  filters {\n");
            Iterator it = zzffVar.zzd().iterator();
            while (it.hasNext()) {
                m19083x(sb, 2, (zzfh) it.next());
            }
        }
        m19084y(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* JADX INFO: renamed from: M */
    final String m19092M(zzfn zzfnVar) {
        if (zzfnVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (zzfnVar.zza()) {
            m19066E(sb, 0, "filter_id", Integer.valueOf(zzfnVar.zzb()));
        }
        m19066E(sb, 0, "property_name", this.f15066a.m18662D().m18777c(zzfnVar.zzc()));
        String strM19062A = m19062A(zzfnVar.zze(), zzfnVar.zzf(), zzfnVar.zzh());
        if (!strM19062A.isEmpty()) {
            m19066E(sb, 0, "filter_type", strM19062A);
        }
        m19083x(sb, 1, zzfnVar.zzd());
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: renamed from: N */
    final Parcelable m19093N(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (AbstractC1946b.a unused) {
            this.f15066a.mo18421a().m18851o().m18834a("Failed to load parcelable from buffer");
        } finally {
            parcelObtain.recycle();
        }
        return parcelable;
    }

    /* JADX INFO: renamed from: R */
    final List m19094R(List list, List list2) {
        int i7;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f15066a.mo18421a().m18854r().m18835b("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    this.f15066a.mo18421a().m18854r().m18836c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i8 = size2;
            i7 = size;
            size = i8;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i7);
    }

    /* JADX INFO: renamed from: S */
    final boolean m19095S(long j7, long j8) {
        return j7 == 0 || j8 <= 0 || Math.abs(this.f15066a.mo18425f().mo18159a() - j7) > j8;
    }

    /* JADX INFO: renamed from: T */
    final long m19096T(byte[] bArr) {
        AbstractC3718s.m18083l(bArr);
        C4164X2 c4164x2 = this.f15066a;
        c4164x2.m18661C().mo18427h();
        MessageDigest messageDigestM19353C = C4389z6.m19353C();
        if (messageDigestM19353C != null) {
            return C4389z6.m19354D(messageDigestM19353C.digest(bArr));
        }
        c4164x2.mo18421a().m18851o().m18834a("Failed to get MD5");
        return 0L;
    }

    /* JADX INFO: renamed from: U */
    final long m19097U(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return m19096T(str.getBytes(Charset.forName("UTF-8")));
    }

    /* JADX INFO: renamed from: V */
    final byte[] m19098V(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e7) {
            this.f15066a.mo18421a().m18851o().m18835b("Failed to gzip content", e7);
            throw e7;
        }
    }

    /* JADX INFO: renamed from: Z */
    final Map m19099Z(Bundle bundle, boolean z7) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z8 = obj instanceof Parcelable[];
            if (z8 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z7) {
                    ArrayList arrayList = new ArrayList();
                    if (z8) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(m19099Z((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            Object obj2 = arrayList2.get(i7);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(m19099Z((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(m19099Z((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4197b6
    /* JADX INFO: renamed from: l */
    protected final boolean mo18457l() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    final C4039G m19100m(zzaa zzaaVar) {
        Object obj;
        Bundle bundleM19101n = m19101n(zzaaVar.zzf(), true);
        String string = (!bundleM19101n.containsKey("_o") || (obj = bundleM19101n.get("_o")) == null) ? "app" : obj.toString();
        String strM27060b = AbstractC6052w.m27060b(zzaaVar.zzb());
        if (strM27060b == null) {
            strM27060b = zzaaVar.zzb();
        }
        return new C4039G(strM27060b, new C4023E(bundleM19101n), string, zzaaVar.zza());
    }

    /* JADX INFO: renamed from: n */
    final Bundle m19101n(Map map, boolean z7) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z7) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    arrayList2.add(m19101n((Map) arrayList.get(i7), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }
}
