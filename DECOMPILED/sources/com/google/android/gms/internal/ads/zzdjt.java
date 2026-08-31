package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3456V;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.InterfaceC3494q0;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.concurrent.Executor;
import p340r2.C6891i;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdjt {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final InterfaceC3494q0 zzb;
    private final zzfdc zzc;
    private final zzdiz zzd;
    private final zzdiu zze;
    private final zzdkh zzf;
    private final zzdkp zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbfl zzj;
    private final zzdir zzk;

    public zzdjt(InterfaceC3494q0 interfaceC3494q0, zzfdc zzfdcVar, zzdiz zzdizVar, zzdiu zzdiuVar, zzdkh zzdkhVar, zzdkp zzdkpVar, Executor executor, Executor executor2, zzdir zzdirVar) {
        this.zzb = interfaceC3494q0;
        this.zzc = zzfdcVar;
        this.zzj = zzfdcVar.zzj;
        this.zzd = zzdizVar;
        this.zze = zzdiuVar;
        this.zzf = zzdkhVar;
        this.zzg = zzdkpVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdirVar;
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i7) {
        if (i7 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i7 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i7 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z7) {
        View viewZzJ = z7 ? this.zze.zzJ() : this.zze.zzK();
        if (viewZzJ == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewZzJ.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewZzJ.getParent()).removeView(viewZzJ);
        }
        viewGroup.addView(viewZzJ, ((Boolean) C3250D.m17200c().zzd(zzbci.zzen)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    public final void zza(final zzdkr zzdkrVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf(zzdkrVar);
            }
        });
    }

    public final void zzb(zzdkr zzdkrVar) {
        zzdkh zzdkhVar;
        if (zzdkrVar == null || (zzdkhVar = this.zzf) == null || zzdkrVar.zzdF() == null || !this.zzd.zzb()) {
            return;
        }
        try {
            zzdkrVar.zzdF().addView(zzdkhVar.zza());
        } catch (zzcez e7) {
            AbstractC3490o0.m17546l("web view can not be obtained", e7);
        }
    }

    public final void zzc(zzdkr zzdkrVar) {
        if (zzdkrVar == null) {
            return;
        }
        Context context = zzdkrVar.zzdJ().getContext();
        if (AbstractC3456V.m17500i(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33326a("Activity context is needed for policy validator.");
                return;
            }
            zzdkp zzdkpVar = this.zzg;
            if (zzdkpVar == null || zzdkrVar.zzdF() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(zzdkpVar.zza(zzdkrVar.zzdF(), windowManager), AbstractC3456V.m17502k());
            } catch (zzcez e7) {
                AbstractC3490o0.m17546l("web view can not be obtained", e7);
            }
        }
    }

    public final boolean zzd(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }

    public final boolean zze(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    /* JADX WARN: Code duplicated, block: B:80:0x018d  */
    final /* synthetic */ void zzf(zzdkr zzdkrVar) {
        ViewGroup viewGroup;
        View viewZzA;
        final ViewGroup viewGroup2;
        zzbft zzbftVarZza;
        Drawable drawable;
        zzdiz zzdizVar = this.zzd;
        if (!zzdizVar.zze() && !zzdizVar.zzc()) {
            viewGroup = null;
            break;
        }
        String[] strArr = {"1098", "3011"};
        int i7 = 0;
        while (true) {
            if (i7 >= 2) {
                viewGroup = null;
                break;
            }
            View viewZzm = zzdkrVar.zzm(strArr[i7]);
            if (viewZzm instanceof ViewGroup) {
                viewGroup = (ViewGroup) viewZzm;
                break;
            }
            i7++;
        }
        Context context = zzdkrVar.zzdJ().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdiu zzdiuVar = this.zze;
        if (zzdiuVar.zzA() != null) {
            viewZzA = zzdiuVar.zzA();
            zzbfl zzbflVar = this.zzj;
            if (zzbflVar != null && viewGroup == null) {
                zzh(layoutParams, zzbflVar.zze);
                viewZzA.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (zzdiuVar.zzz() instanceof zzbfe) {
            zzbfe zzbfeVar = (zzbfe) zzdiuVar.zzz();
            if (viewGroup == null) {
                zzh(layoutParams, zzbfeVar.zzi());
                viewGroup = null;
            }
            View zzbffVar = new zzbff(context, zzbfeVar, layoutParams);
            zzbffVar.setContentDescription((CharSequence) C3250D.m17200c().zzd(zzbci.zzel));
            viewZzA = zzbffVar;
        } else {
            viewZzA = null;
        }
        if (viewZzA != null) {
            if (viewZzA.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewZzA.getParent()).removeView(viewZzA);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(viewZzA);
            } else {
                C6891i c6891i = new C6891i(zzdkrVar.zzdJ().getContext());
                c6891i.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                c6891i.addView(viewZzA);
                FrameLayout frameLayoutZzdF = zzdkrVar.zzdF();
                if (frameLayoutZzdF != null) {
                    frameLayoutZzdF.addView(c6891i);
                }
            }
            zzdkrVar.zzi(zzdkrVar.zzn(), viewZzA, true);
        }
        zzgjz zzgjzVar = zzdjp.zza;
        int size = zzgjzVar.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                viewGroup2 = null;
                break;
            }
            View viewZzm2 = zzdkrVar.zzm((String) zzgjzVar.get(i8));
            i8++;
            if (viewZzm2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) viewZzm2;
                break;
            }
        }
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzi(viewGroup2, true)) {
            if (zzdiuVar.zzT() != null) {
                zzdiuVar.zzT().zzaq(new zzdjq(zzdkrVar, viewGroup2));
                return;
            }
            return;
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkP)).booleanValue() && zzi(viewGroup2, false)) {
            if (zzdiuVar.zzU() != null) {
                zzdiuVar.zzU().zzaq(new zzdjq(zzdkrVar, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View viewZzdJ = zzdkrVar.zzdJ();
        Context context2 = viewZzdJ != null ? viewZzdJ.getContext() : null;
        if (context2 == null || (zzbftVarZza = this.zzk.zza()) == null) {
            return;
        }
        try {
            InterfaceC3772a interfaceC3772aZzg = zzbftVarZza.zzg();
            if (interfaceC3772aZzg == null || (drawable = (Drawable) BinderC3773b.m18220M0(interfaceC3772aZzg)) == null) {
                return;
            }
            ImageView imageView = new ImageView(context2);
            imageView.setImageDrawable(drawable);
            InterfaceC3772a interfaceC3772aZzo = zzdkrVar.zzo();
            if (interfaceC3772aZzo == null) {
                imageView.setScaleType(zza);
            } else if (((Boolean) C3250D.m17200c().zzd(zzbci.zzgE)).booleanValue()) {
                imageView.setScaleType((ImageView.ScaleType) BinderC3773b.m18220M0(interfaceC3772aZzo));
            } else {
                imageView.setScaleType(zza);
            }
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView);
        } catch (RemoteException unused) {
            int i9 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Could not get main image drawable");
        }
    }

    final /* synthetic */ void zzg(ViewGroup viewGroup) {
        zzdiu zzdiuVar = this.zze;
        if (zzdiuVar.zzJ() != null) {
            boolean z7 = viewGroup != null;
            if (zzdiuVar.zzx() == 2 || zzdiuVar.zzx() == 1) {
                this.zzb.mo17551d(this.zzc.zzg, String.valueOf(zzdiuVar.zzx()), z7);
            } else if (zzdiuVar.zzx() == 6) {
                InterfaceC3494q0 interfaceC3494q0 = this.zzb;
                String str = this.zzc.zzg;
                interfaceC3494q0.mo17551d(str, "2", z7);
                interfaceC3494q0.mo17551d(str, "1", z7);
            }
        }
    }
}
