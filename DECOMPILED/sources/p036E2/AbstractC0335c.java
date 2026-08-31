package p036E2;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3323b0;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzdsg;
import com.google.android.gms.internal.ads.zzdsr;
import com.google.android.gms.internal.ads.zzfcu;
import com.google.android.gms.internal.ads.zzfdc;
import com.google.android.gms.internal.ads.zzfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: E2.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0335c {
    /* JADX INFO: renamed from: a */
    public static boolean m1519a(zzfcu zzfcuVar) {
        return m1525g(zzfcuVar.zza.zza) != 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX INFO: renamed from: b */
    public static String m1520b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str) {
            case "requester_type_0":
                return "0";
            case "requester_type_1":
                return "1";
            case "requester_type_2":
                return "2";
            case "requester_type_3":
                return "3";
            case "requester_type_4":
                return "4";
            case "requester_type_5":
                return "5";
            case "requester_type_6":
                return "6";
            case "requester_type_7":
                return "7";
            case "requester_type_8":
                return "8";
            default:
                return str;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m1521c(C3349h2 c3349h2) {
        Bundle bundle;
        return (c3349h2 == null || (bundle = c3349h2.f13951c) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX INFO: renamed from: d */
    public static zzfig m1522d(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        if (TextUtils.isEmpty(string)) {
            return zzfig.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
        switch (string) {
            case "requester_type_0":
                return zzfig.SCAR_REQUEST_TYPE_ADMOB;
            case "requester_type_1":
                return zzfig.SCAR_REQUEST_TYPE_INBOUND_MEDIATION;
            case "requester_type_2":
                return zzfig.SCAR_REQUEST_TYPE_GBID;
            case "requester_type_3":
                return zzfig.SCAR_REQUEST_TYPE_GOLDENEYE;
            case "requester_type_4":
                return zzfig.SCAR_REQUEST_TYPE_YAVIN;
            case "requester_type_5":
                return zzfig.SCAR_REQUEST_TYPE_UNITY;
            case "requester_type_6":
                return zzfig.SCAR_REQUEST_TYPE_PAW;
            case "requester_type_7":
                return zzfig.SCAR_REQUEST_TYPE_GUILDER;
            case "requester_type_8":
                return zzfig.SCAR_REQUEST_TYPE_GAM_S2S;
            default:
                return zzfig.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m1523e(final zzdsr zzdsrVar, zzdsg zzdsgVar, final String str, final Pair... pairArr) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhq)).booleanValue()) {
            final zzdsg zzdsgVar2 = null;
            zzbzh.zza.execute(new Runnable(zzdsgVar2, str, pairArr) { // from class: E2.v0

                /* JADX INFO: renamed from: b */
                private final /* synthetic */ String f1476b;

                /* JADX INFO: renamed from: c */
                private final /* synthetic */ Pair[] f1477c;

                {
                    this.f1476b = str;
                    this.f1477c = pairArr;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    AbstractC0335c.m1524f(this.f1475a, null, this.f1476b, this.f1477c);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ void m1524f(zzdsr zzdsrVar, zzdsg zzdsgVar, String str, Pair[] pairArr) {
        ConcurrentHashMap concurrentHashMapZzd = zzdsrVar.zzd();
        m1526h(concurrentHashMapZzd, "action", str);
        for (Pair pair : pairArr) {
            m1526h(concurrentHashMapZzd, (String) pair.first, (String) pair.second);
        }
        zzdsrVar.zzb(concurrentHashMapZzd);
    }

    /* JADX INFO: renamed from: g */
    public static int m1525g(zzfdc zzfdcVar) {
        if (zzfdcVar.zzs) {
            return 2;
        }
        C3349h2 c3349h2 = zzfdcVar.zzd;
        C3323b0 c3323b0 = c3349h2.f13939D;
        if (c3323b0 == null && c3349h2.f13944I == null) {
            return 1;
        }
        if (c3323b0 == null || c3349h2.f13944I == null) {
            return c3323b0 != null ? 3 : 4;
        }
        return 5;
    }

    /* JADX INFO: renamed from: h */
    private static void m1526h(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }
}
