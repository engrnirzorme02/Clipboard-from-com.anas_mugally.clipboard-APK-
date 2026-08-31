package p396y2;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.InterfaceC3318a;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.internal.ads.zzazc;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzddz;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: y2.c */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC7515c extends zzbsv implements zzazc {

    /* JADX INFO: renamed from: a */
    private final AdOverlayInfoParcel f30119a;

    /* JADX INFO: renamed from: b */
    private final Activity f30120b;

    /* JADX INFO: renamed from: f */
    private final boolean f30124f;

    /* JADX INFO: renamed from: c */
    private boolean f30121c = false;

    /* JADX INFO: renamed from: d */
    private boolean f30122d = false;

    /* JADX INFO: renamed from: e */
    private boolean f30123e = false;

    /* JADX INFO: renamed from: r */
    private boolean f30125r = false;

    /* JADX INFO: renamed from: s */
    private boolean f30126s = false;

    /* JADX WARN: Code duplicated, block: B:10:0x004c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0064  */
    /* JADX WARN: Code duplicated, block: B:16:0x0078  */
    /* JADX WARN: Code duplicated, block: B:8:0x0048  */
    public BinderC7515c(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        C7524l c7524l;
        boolean z7 = false;
        this.f30119a = adOverlayInfoParcel;
        this.f30120b = activity;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfj)).booleanValue()) {
            c7524l = adOverlayInfoParcel.f14143a;
            if (c7524l != null) {
                if (Build.MANUFACTURER.matches((String) C3250D.m17200c().zzd(zzbci.zzfm))) {
                    if (Build.MODEL.matches((String) C3250D.m17200c().zzd(zzbci.zzfn))) {
                        z7 = true;
                    }
                }
            }
        } else {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfk)).booleanValue()) {
                c7524l = adOverlayInfoParcel.f14143a;
                if (c7524l != null) {
                    if (Build.MANUFACTURER.matches((String) C3250D.m17200c().zzd(zzbci.zzfm))) {
                        if (Build.MODEL.matches((String) C3250D.m17200c().zzd(zzbci.zzfn))) {
                            z7 = true;
                        }
                    }
                }
            } else {
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfo)).booleanValue()) {
                    c7524l = adOverlayInfoParcel.f14143a;
                    if (c7524l != null && c7524l.f30136u) {
                        if (Build.MANUFACTURER.matches((String) C3250D.m17200c().zzd(zzbci.zzfm))) {
                            if (Build.MODEL.matches((String) C3250D.m17200c().zzd(zzbci.zzfn))) {
                                z7 = true;
                            }
                        }
                    }
                }
            }
        }
        this.f30124f = z7;
    }

    private final synchronized void zzc() {
        try {
            if (!this.f30122d) {
                InterfaceC7536x interfaceC7536x = this.f30119a.f14145c;
                if (interfaceC7536x != null) {
                    interfaceC7536x.zzdY(4);
                }
                this.f30122d = true;
                if (this.f30124f) {
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfo)).booleanValue()) {
                        C7351t.m32353k().zzc(this);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzH(int i7, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zza(boolean z7) {
        if (!z7) {
            this.f30126s = true;
        } else if (this.f30126s) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a("Foregrounded: finishing activity from LauncherOverlay");
            this.f30120b.finish();
        }
    }

    final /* synthetic */ void zzb() {
        if (this.f30125r) {
            this.f30120b.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzf() {
        InterfaceC7536x interfaceC7536x = this.f30119a.f14145c;
        if (interfaceC7536x != null) {
            interfaceC7536x.zzdA();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final boolean zzg() {
        return ((Boolean) C3250D.m17200c().zzd(zzbci.zzfk)).booleanValue() && this.f30124f && this.f30125r;
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzh(Bundle bundle) {
        InterfaceC7536x interfaceC7536x;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjG)).booleanValue() && !this.f30123e) {
            this.f30120b.requestWindowFeature(1);
        }
        boolean z7 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z7 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f30119a;
        if (adOverlayInfoParcel == null) {
            this.f30120b.finish();
            return;
        }
        if (z7) {
            this.f30120b.finish();
            return;
        }
        if (bundle == null) {
            InterfaceC3318a interfaceC3318a = adOverlayInfoParcel.f14144b;
            if (interfaceC3318a != null) {
                interfaceC3318a.onAdClicked();
            }
            zzddz zzddzVar = adOverlayInfoParcel.f14139F;
            if (zzddzVar != null) {
                zzddzVar.zzdz();
            }
            Activity activity = this.f30120b;
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (interfaceC7536x = adOverlayInfoParcel.f14145c) != null) {
                interfaceC7536x.zzh();
            }
        }
        if (this.f30124f) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfo)).booleanValue()) {
                C7351t.m32353k().zzb(this);
            }
        }
        Activity activity2 = this.f30120b;
        C7524l c7524l = adOverlayInfoParcel.f14143a;
        InterfaceC7516d interfaceC7516d = adOverlayInfoParcel.f14151t;
        C7351t.m32347e();
        if (C7513a.m33153b(activity2, c7524l, interfaceC7516d, c7524l.f30135t, null, "")) {
            return;
        }
        activity2.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzk() {
        if (this.f30121c) {
            AbstractC3490o0.m17545k("LauncherOverlay finishing activity");
            this.f30120b.finish();
            return;
        }
        this.f30121c = true;
        this.f30125r = true;
        InterfaceC7536x interfaceC7536x = this.f30119a.f14145c;
        if (interfaceC7536x != null) {
            interfaceC7536x.zzdC();
        }
        if (this.f30124f) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfj)).booleanValue()) {
                C3431F0.f14180l.postDelayed(new Runnable() { // from class: y2.b
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f30118a.zzb();
                    }
                }, ((Integer) C3250D.m17200c().zzd(zzbci.zzfl)).intValue());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzl() {
        this.f30125r = false;
        InterfaceC7536x interfaceC7536x = this.f30119a.f14145c;
        if (interfaceC7536x != null) {
            interfaceC7536x.zzdB();
        }
        if (this.f30120b.isFinishing()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzm(int i7, int i8, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzn(InterfaceC3772a interfaceC3772a) {
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzo(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f30121c);
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzp() {
        if (this.f30120b.isFinishing()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzq() {
        if (this.f30120b.isFinishing()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzs() {
        this.f30123e = true;
    }
}
