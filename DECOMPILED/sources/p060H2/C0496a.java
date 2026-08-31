package p060H2;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3243A1;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3368m1;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbtn;
import p314o2.C6555g;
import p314o2.EnumC6551c;
import p404z2.AbstractC7586c;

/* JADX INFO: renamed from: H2.a */
/* JADX INFO: loaded from: classes.dex */
public class C0496a {

    /* JADX INFO: renamed from: a */
    private final C3243A1 f1872a;

    public C0496a(C3243A1 c3243a1) {
        this.f1872a = c3243a1;
    }

    /* JADX INFO: renamed from: a */
    public static void m2107a(Context context, EnumC6551c enumC6551c, C6555g c6555g, AbstractC0497b abstractC0497b) {
        m2108c(context, enumC6551c, c6555g, null, abstractC0497b);
    }

    /* JADX INFO: renamed from: c */
    private static void m2108c(final Context context, final EnumC6551c enumC6551c, final C6555g c6555g, final String str, final AbstractC0497b abstractC0497b) {
        zzbci.zza(context);
        if (((Boolean) zzbeg.zzj.zze()).booleanValue()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlX)).booleanValue()) {
                AbstractC7586c.f30234b.execute(new Runnable() { // from class: H2.c
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        C6555g c6555g2 = c6555g;
                        C3368m1 c3368m1M27824a = c6555g2 == null ? null : c6555g2.m27824a();
                        new zzbtn(context, enumC6551c, c3368m1M27824a, str).zzb(abstractC0497b);
                    }
                });
                return;
            }
        }
        new zzbtn(context, enumC6551c, c6555g == null ? null : c6555g.m27824a(), str).zzb(abstractC0497b);
    }

    /* JADX INFO: renamed from: b */
    public String m2109b() {
        return this.f1872a.m17189a();
    }
}
