package p324p2;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbmg;
import com.google.android.gms.internal.ads.zzbtt;
import p004A2.AbstractC0012a;
import p404z2.AbstractC7586c;

/* JADX INFO: renamed from: p2.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6736c extends AbstractC0012a {
    public static void load(final Context context, final String str, final C6734a c6734a, final AbstractC6737d abstractC6737d) {
        AbstractC3718s.m18084m(context, "Context cannot be null.");
        AbstractC3718s.m18084m(str, "AdUnitId cannot be null.");
        AbstractC3718s.m18084m(c6734a, "AdManagerAdRequest cannot be null.");
        AbstractC3718s.m18084m(abstractC6737d, "LoadCallback cannot be null.");
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        zzbci.zza(context);
        if (((Boolean) zzbeg.zzi.zze()).booleanValue()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlX)).booleanValue()) {
                AbstractC7586c.f30234b.execute(new Runnable(context, str, c6734a, abstractC6737d) { // from class: p2.f

                    /* JADX INFO: renamed from: a */
                    private final /* synthetic */ Context f26201a;

                    /* JADX INFO: renamed from: b */
                    private final /* synthetic */ String f26202b;

                    /* JADX INFO: renamed from: c */
                    private final /* synthetic */ C6734a f26203c;

                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        C6734a c6734a2 = this.f26203c;
                        Context context2 = this.f26201a;
                        try {
                            new zzbmg(context2, this.f26202b).zza(c6734a2.m27824a(), null);
                        } catch (IllegalStateException e7) {
                            zzbtt.zza(context2).zzh(e7, "AdManagerInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbmg(context, str).zza(c6734a.m27824a(), abstractC6737d);
    }
}
