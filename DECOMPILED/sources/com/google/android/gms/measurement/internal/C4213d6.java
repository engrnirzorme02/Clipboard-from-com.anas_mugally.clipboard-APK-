package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzil;
import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.internal.measurement.zzis;
import java.util.Collections;
import java.util.HashMap;
import p283k3.EnumC6024G;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.d6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4213d6 extends AbstractC4160W5 {
    C4213d6(C4317q6 c4317q6) {
        super(c4317q6);
    }

    /* JADX INFO: renamed from: k */
    private final String m18717k(String str) {
        String strM18609x = this.f15465b.m18895D0().m18609x(str);
        if (TextUtils.isEmpty(strM18609x)) {
            return (String) AbstractC4209d2.f15694r.m18706b(null);
        }
        Uri uri = Uri.parse((String) AbstractC4209d2.f15694r.m18706b(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(strM18609x).length() + 1 + String.valueOf(authority).length());
        sb.append(strM18609x);
        sb.append(".");
        sb.append(authority);
        builderBuildUpon.authority(sb.toString());
        return builderBuildUpon.build().toString();
    }

    /* JADX INFO: renamed from: l */
    private static final boolean m18718l(String str) {
        String str2 = (String) AbstractC4209d2.f15698t.m18706b(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final C4205c6 m18719i(String str) {
        C4361w2 c4361w2M19021J0;
        C4317q6 c4317q6 = this.f15465b;
        C4361w2 c4361w2M19021J1 = c4317q6.m18898F0().m19021J0(str);
        C4205c6 c4205c6 = null;
        if (c4361w2M19021J1 == null || !c4361w2M19021J1.m19140V()) {
            return new C4205c6(m18717k(str), Collections.EMPTY_MAP, EnumC6024G.GOOGLE_ANALYTICS, null);
        }
        zzil zzilVarZzb = zzis.zzb();
        zzilVarZzb.zzb(2);
        zzilVarZzb.zza((zzin) AbstractC3718s.m18083l(zzin.zzb(c4361w2M19021J1.m19131M())));
        String strM19176p0 = c4361w2M19021J1.m19176p0();
        zzgl zzglVarM18608w = c4317q6.m18895D0().m18608w(str);
        if (zzglVarM18608w == null || (c4361w2M19021J0 = c4317q6.m18898F0().m19021J0(str)) == null || ((!zzglVarM18608w.zzp() || zzglVarM18608w.zzq().zzc() != 100) && !this.f15066a.m18661C().m19380P(str, c4361w2M19021J0.m19168l0()) && (TextUtils.isEmpty(strM19176p0) || Math.abs(strM19176p0.hashCode() % 100) >= zzglVarM18608w.zzq().zzc()))) {
            zzilVarZzb.zzc(3);
            return new C4205c6(m18717k(str), Collections.EMPTY_MAP, EnumC6024G.GOOGLE_ANALYTICS, (zzis) zzilVarZzb.zzbc());
        }
        String strM19174o0 = c4361w2M19021J1.m19174o0();
        zzilVarZzb.zzb(2);
        zzgl zzglVarM18608w2 = c4317q6.m18895D0().m18608w(c4361w2M19021J1.m19174o0());
        if (zzglVarM18608w2 == null || !zzglVarM18608w2.zzp()) {
            this.f15066a.mo18421a().m18859w().m18835b("[sgtm] Missing sgtm_setting in remote config. appId", strM19174o0);
            zzilVarZzb.zzc(4);
        } else {
            HashMap map = new HashMap();
            if (!TextUtils.isEmpty(c4361w2M19021J1.m19168l0())) {
                map.put("x-gtm-server-preview", c4361w2M19021J1.m19168l0());
            }
            String strZzd = zzglVarM18608w2.zzq().zzd();
            zzin zzinVarZzb = zzin.zzb(c4361w2M19021J1.m19131M());
            if (zzinVarZzb != null && zzinVarZzb != zzin.CLIENT_UPLOAD_ELIGIBLE) {
                zzilVarZzb.zza(zzinVarZzb);
            } else if (m18718l(c4361w2M19021J1.m19174o0())) {
                zzilVarZzb.zza(zzin.PINNED_TO_SERVICE_UPLOAD);
            } else if (TextUtils.isEmpty(strZzd)) {
                zzilVarZzb.zza(zzin.MISSING_SGTM_SERVER_URL);
            } else {
                this.f15066a.mo18421a().m18859w().m18835b("[sgtm] Eligible for client side upload. appId", strM19174o0);
                zzilVarZzb.zzb(3);
                zzilVarZzb.zza(zzin.CLIENT_UPLOAD_ELIGIBLE);
                c4205c6 = new C4205c6(strZzd, map, EnumC6024G.SGTM_CLIENT, (zzis) zzilVarZzb.zzbc());
            }
            zzglVarM18608w2.zzq().zza();
            zzglVarM18608w2.zzq().zzb();
            C4164X2 c4164x2 = this.f15066a;
            c4164x2.mo18423c();
            if (TextUtils.isEmpty(strZzd)) {
                zzilVarZzb.zzc(6);
                c4164x2.mo18421a().m18859w().m18835b("[sgtm] Local service, missing sgtm_server_url", c4361w2M19021J1.m19174o0());
            } else {
                c4164x2.mo18421a().m18859w().m18835b("[sgtm] Eligible for local service direct upload. appId", strM19174o0);
                zzilVarZzb.zzb(5);
                zzilVarZzb.zzc(2);
                c4205c6 = new C4205c6(strZzd, map, EnumC6024G.SGTM, (zzis) zzilVarZzb.zzbc());
            }
        }
        return c4205c6 != null ? c4205c6 : new C4205c6(m18717k(str), Collections.EMPTY_MAP, EnumC6024G.GOOGLE_ANALYTICS, (zzis) zzilVarZzb.zzbc());
    }

    /* JADX INFO: renamed from: j */
    final boolean m18720j(String str, zzin zzinVar) {
        zzgl zzglVarM18608w;
        mo18427h();
        return (zzinVar != zzin.CLIENT_UPLOAD_ELIGIBLE || m18718l(str) || (zzglVarM18608w = this.f15465b.m18895D0().m18608w(str)) == null || !zzglVarM18608w.zzp() || zzglVarM18608w.zzq().zzd().isEmpty()) ? false : true;
    }
}
