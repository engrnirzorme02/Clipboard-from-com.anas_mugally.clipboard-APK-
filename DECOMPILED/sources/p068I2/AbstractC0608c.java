package p068I2;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbwa;
import com.google.android.gms.internal.ads.zzbwj;
import p314o2.AbstractC6542B;
import p314o2.AbstractC6560l;
import p314o2.C6555g;
import p314o2.C6571w;
import p314o2.InterfaceC6566r;
import p324p2.C6734a;
import p404z2.AbstractC7586c;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: I2.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0608c {
    @Deprecated
    public static boolean isAdAvailable(Context context, String str) {
        AbstractC3718s.m18084m(context, "Context cannot be null.");
        AbstractC3718s.m18084m(str, "AdUnitId cannot be null.");
        try {
            return AbstractC6542B.m27788a(context).zzf(str);
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
            return false;
        }
    }

    public static void load(final Context context, final String str, final C6555g c6555g, final AbstractC0609d abstractC0609d) {
        AbstractC3718s.m18084m(context, "Context cannot be null.");
        AbstractC3718s.m18084m(str, "AdUnitId cannot be null.");
        AbstractC3718s.m18084m(c6555g, "AdRequest cannot be null.");
        AbstractC3718s.m18084m(abstractC0609d, "LoadCallback cannot be null.");
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        zzbci.zza(context);
        if (((Boolean) zzbeg.zzk.zze()).booleanValue()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlX)).booleanValue()) {
                AbstractC7586c.f30234b.execute(new Runnable() { // from class: I2.h
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AbstractC0609d abstractC0609d2 = abstractC0609d;
                        C6555g c6555g2 = c6555g;
                        Context context2 = context;
                        try {
                            new zzbwj(context2, str).zza(c6555g2.m27824a(), abstractC0609d2);
                        } catch (IllegalStateException e7) {
                            zzbtt.zza(context2).zzh(e7, "RewardedAd.load");
                        }
                    }
                });
                return;
            }
        }
        AbstractC7599p.m33326a("Loading on UI thread");
        new zzbwj(context, str).zza(c6555g.m27824a(), abstractC0609d);
    }

    @Deprecated
    public static AbstractC0608c pollAd(Context context, String str) {
        AbstractC3718s.m18084m(context, "Context cannot be null.");
        AbstractC3718s.m18084m(str, "AdUnitId cannot be null.");
        try {
            zzbwa zzbwaVarZzg = AbstractC6542B.m27788a(context).zzg(str);
            if (zzbwaVarZzg != null) {
                return new zzbwj(context, str, zzbwaVarZzg);
            }
            AbstractC7599p.m33334i("Failed to obtain a Rewarded Ad from the preloader.", null);
            return null;
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
            return null;
        }
    }

    public abstract C6571w getResponseInfo();

    public abstract void setFullScreenContentCallback(AbstractC6560l abstractC6560l);

    public abstract void show(Activity activity, InterfaceC6566r interfaceC6566r);

    public static void load(final Context context, final String str, final C6734a c6734a, final AbstractC0609d abstractC0609d) {
        AbstractC3718s.m18084m(context, "Context cannot be null.");
        AbstractC3718s.m18084m(str, "AdUnitId cannot be null.");
        AbstractC3718s.m18084m(c6734a, "AdManagerAdRequest cannot be null.");
        AbstractC3718s.m18084m(abstractC0609d, "LoadCallback cannot be null.");
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        zzbci.zza(context);
        if (((Boolean) zzbeg.zzk.zze()).booleanValue()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlX)).booleanValue()) {
                AbstractC7599p.m33326a("Loading on background thread");
                AbstractC7586c.f30234b.execute(new Runnable() { // from class: I2.g
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AbstractC0609d abstractC0609d2 = abstractC0609d;
                        C6734a c6734a2 = c6734a;
                        Context context2 = context;
                        try {
                            new zzbwj(context2, str).zza(c6734a2.m27824a(), abstractC0609d2);
                        } catch (IllegalStateException e7) {
                            zzbtt.zza(context2).zzh(e7, "RewardedAd.loadAdManager");
                        }
                    }
                });
                return;
            }
        }
        AbstractC7599p.m33326a("Loading on UI thread");
        new zzbwj(context, str).zza(c6734a.m27824a(), abstractC0609d);
    }
}
