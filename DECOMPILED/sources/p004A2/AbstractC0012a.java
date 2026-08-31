package p004A2;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.InterfaceC3312Y;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbmg;
import com.google.android.gms.internal.ads.zzbtt;
import p314o2.AbstractC6542B;
import p314o2.AbstractC6560l;
import p314o2.C6555g;
import p314o2.C6571w;
import p404z2.AbstractC7586c;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: A2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0012a {
    @Deprecated
    public static boolean isAdAvailable(Context context, String str) {
        try {
            return AbstractC6542B.m27788a(context).zzj(str);
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
            return false;
        }
    }

    public static void load(final Context context, final String str, final C6555g c6555g, final AbstractC0013b abstractC0013b) {
        AbstractC3718s.m18084m(context, "Context cannot be null.");
        AbstractC3718s.m18084m(str, "AdUnitId cannot be null.");
        AbstractC3718s.m18084m(c6555g, "AdRequest cannot be null.");
        AbstractC3718s.m18084m(abstractC0013b, "LoadCallback cannot be null.");
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        zzbci.zza(context);
        if (((Boolean) zzbeg.zzi.zze()).booleanValue()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlX)).booleanValue()) {
                AbstractC7586c.f30234b.execute(new Runnable() { // from class: A2.c
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AbstractC0013b abstractC0013b2 = abstractC0013b;
                        C6555g c6555g2 = c6555g;
                        Context context2 = context;
                        try {
                            new zzbmg(context2, str).zza(c6555g2.m27824a(), abstractC0013b2);
                        } catch (IllegalStateException e7) {
                            zzbtt.zza(context2).zzh(e7, "InterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbmg(context, str).zza(c6555g.m27824a(), abstractC0013b);
    }

    @Deprecated
    public static AbstractC0012a pollAd(Context context, String str) {
        try {
            InterfaceC3312Y interfaceC3312YZzk = AbstractC6542B.m27788a(context).zzk(str);
            if (interfaceC3312YZzk != null) {
                return new zzbmg(context, str, interfaceC3312YZzk);
            }
            AbstractC7599p.m33334i("Failed to obtain an Interstitial Ad from the preloader.", null);
            return null;
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
            return null;
        }
    }

    public abstract C6571w getResponseInfo();

    public abstract void setFullScreenContentCallback(AbstractC6560l abstractC6560l);

    public abstract void setImmersiveMode(boolean z7);

    public abstract void show(Activity activity);
}
