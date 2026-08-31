package p332q2;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.ads.zzazx;
import com.google.android.gms.internal.ads.zzbab;
import com.google.android.gms.internal.ads.zzbaj;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbtt;
import p314o2.AbstractC6542B;
import p314o2.AbstractC6553e;
import p314o2.AbstractC6560l;
import p314o2.C6555g;
import p314o2.C6571w;
import p404z2.AbstractC7586c;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: q2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6824a {

    /* JADX INFO: renamed from: q2.a$a */
    public static abstract class a extends AbstractC6553e {
    }

    @Deprecated
    public static boolean isAdAvailable(Context context, String str) {
        try {
            return AbstractC6542B.m27788a(context).zzh(str);
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
            return false;
        }
    }

    public static void load(final Context context, final String str, final C6555g c6555g, final a aVar) {
        AbstractC3718s.m18084m(context, "Context cannot be null.");
        AbstractC3718s.m18084m(str, "adUnitId cannot be null.");
        AbstractC3718s.m18084m(c6555g, "AdRequest cannot be null.");
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        zzbci.zza(context);
        if (((Boolean) zzbeg.zzd.zze()).booleanValue()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlX)).booleanValue()) {
                AbstractC7586c.f30234b.execute(new Runnable() { // from class: q2.b
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AbstractC6824a.a aVar2 = aVar;
                        C6555g c6555g2 = c6555g;
                        Context context2 = context;
                        try {
                            new zzbaj(context2, str, c6555g2.m27824a(), aVar2).zza();
                        } catch (IllegalStateException e7) {
                            zzbtt.zza(context2).zzh(e7, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbaj(context, str, c6555g.m27824a(), aVar).zza();
    }

    @Deprecated
    public static AbstractC6824a pollAd(Context context, String str) {
        try {
            zzbab zzbabVarZzi = AbstractC6542B.m27788a(context).zzi(str);
            if (zzbabVarZzi != null) {
                return new zzazx(zzbabVarZzi, str);
            }
            AbstractC7599p.m33334i("Failed to obtain an App Open ad from the preloader.", null);
            return null;
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
            return null;
        }
    }

    public abstract C6571w getResponseInfo();

    public abstract void setFullScreenContentCallback(AbstractC6560l abstractC6560l);

    public abstract void show(Activity activity);
}
