package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.measurement.zzfl;
import com.google.android.gms.internal.measurement.zzfr;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.c */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4198c {

    /* JADX INFO: renamed from: a */
    final String f15566a;

    /* JADX INFO: renamed from: b */
    final int f15567b;

    /* JADX INFO: renamed from: c */
    Boolean f15568c;

    /* JADX INFO: renamed from: d */
    Boolean f15569d;

    /* JADX INFO: renamed from: e */
    Long f15570e;

    /* JADX INFO: renamed from: f */
    Long f15571f;

    AbstractC4198c(String str, int i7) {
        this.f15566a = str;
        this.f15567b = i7;
    }

    /* JADX INFO: renamed from: d */
    private static Boolean m18698d(String str, int i7, boolean z7, String str2, List list, String str3, C4313q2 c4313q2) {
        if (i7 == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z7 && i7 != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i7 - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z7 ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (c4313q2 != null) {
                        c4313q2.m18854r().m18835b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: e */
    static Boolean m18699e(Boolean bool, boolean z7) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z7);
    }

    /* JADX INFO: renamed from: f */
    static Boolean m18700f(String str, zzfr zzfrVar, C4313q2 c4313q2) {
        List list;
        AbstractC3718s.m18083l(zzfrVar);
        if (str == null || !zzfrVar.zza() || zzfrVar.zzj() == 1 || (zzfrVar.zzj() != 7 ? !zzfrVar.zzb() : zzfrVar.zzg() == 0)) {
            return null;
        }
        int iZzj = zzfrVar.zzj();
        boolean zZze = zzfrVar.zze();
        String strZzc = (zZze || iZzj == 2 || iZzj == 7) ? zzfrVar.zzc() : zzfrVar.zzc().toUpperCase(Locale.ENGLISH);
        if (zzfrVar.zzg() == 0) {
            list = null;
        } else {
            List listZzf = zzfrVar.zzf();
            if (!zZze) {
                ArrayList arrayList = new ArrayList(listZzf.size());
                Iterator it = listZzf.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                listZzf = Collections.unmodifiableList(arrayList);
            }
            list = listZzf;
        }
        return m18698d(str, iZzj, zZze, strZzc, list, iZzj == 2 ? strZzc : null, c4313q2);
    }

    /* JADX INFO: renamed from: g */
    static Boolean m18701g(long j7, zzfl zzflVar) {
        try {
            return m18704j(new BigDecimal(j7), zzflVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    static Boolean m18702h(double d7, zzfl zzflVar) {
        try {
            return m18704j(new BigDecimal(d7), zzflVar, Math.ulp(d7));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    static Boolean m18703i(String str, zzfl zzflVar) {
        if (!C4349u6.m19068O(str)) {
            return null;
        }
        try {
            return m18704j(new BigDecimal(str), zzflVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    static Boolean m18704j(BigDecimal bigDecimal, zzfl zzflVar, double d7) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        AbstractC3718s.m18083l(zzflVar);
        if (zzflVar.zza()) {
            if (zzflVar.zzm() != 1) {
                if (zzflVar.zzm() == 5) {
                    if (!zzflVar.zzf() || !zzflVar.zzh()) {
                        return null;
                    }
                } else if (!zzflVar.zzd()) {
                    return null;
                }
                int iZzm = zzflVar.zzm();
                if (zzflVar.zzm() == 5) {
                    if (C4349u6.m19068O(zzflVar.zzg()) && C4349u6.m19068O(zzflVar.zzi())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(zzflVar.zzg());
                            bigDecimal4 = new BigDecimal(zzflVar.zzi());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!C4349u6.m19068O(zzflVar.zze())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(zzflVar.zze());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (iZzm == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i7 = iZzm - 1;
                if (i7 == 1) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                }
                if (i7 == 2) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
                if (i7 != 3) {
                    if (i7 == 4 && bigDecimal3 != null) {
                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                    }
                    return null;
                }
                if (bigDecimal2 == null) {
                    return null;
                }
                if (d7 != 0.0d) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d7).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d7).multiply(new BigDecimal(2)))) < 0);
                }
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    abstract int mo18690a();

    /* JADX INFO: renamed from: b */
    abstract boolean mo18691b();

    /* JADX INFO: renamed from: c */
    abstract boolean mo18692c();
}
