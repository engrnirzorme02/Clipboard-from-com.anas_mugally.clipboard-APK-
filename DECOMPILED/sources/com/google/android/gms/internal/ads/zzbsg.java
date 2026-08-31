package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AbstractBinderC3269J0;
import com.google.android.gms.ads.internal.client.BinderC3263H0;
import com.google.android.gms.ads.internal.client.BinderC3293R1;
import com.google.android.gms.ads.internal.client.C3255E1;
import com.google.android.gms.ads.internal.client.C3275L0;
import com.google.android.gms.ads.internal.client.InterfaceC3272K0;
import com.google.android.gms.ads.internal.client.InterfaceC3328c1;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import p314o2.C6571w;
import p314o2.InterfaceC6562n;
import p314o2.InterfaceC6563o;
import p314o2.InterfaceC6564p;
import p314o2.InterfaceC6565q;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbsg extends NativeAd {
    private final zzbhq zza;
    private final zzbsf zzc;
    private final NativeAd.AbstractC3516a zzd;
    private final List zzb = new ArrayList();
    private final List zze = new ArrayList();
    private final AtomicLong zzf = new AtomicLong();

    public zzbsg(zzbhq zzbhqVar) {
        zzbsf zzbsfVar;
        this.zza = zzbhqVar;
        zzbsd zzbsdVar = null;
        try {
            List listZzf = zzbhqVar.zzf();
            if (listZzf != null) {
                for (Object obj : listZzf) {
                    zzbfw zzbfwVarZzh = obj instanceof IBinder ? zzbfv.zzh((IBinder) obj) : null;
                    if (zzbfwVarZzh != null) {
                        this.zzb.add(new zzbsf(zzbfwVarZzh));
                    }
                }
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
        try {
            List listZzz = this.zza.zzz();
            if (listZzz != null) {
                for (Object obj2 : listZzz) {
                    InterfaceC3272K0 interfaceC3272K0M17210L0 = obj2 instanceof IBinder ? AbstractBinderC3269J0.m17210L0((IBinder) obj2) : null;
                    if (interfaceC3272K0M17210L0 != null) {
                        this.zze.add(new C3275L0(interfaceC3272K0M17210L0));
                    }
                }
            }
        } catch (RemoteException e8) {
            AbstractC7599p.m33329d("", e8);
        }
        try {
            zzbfw zzbfwVarZzh2 = this.zza.zzh();
            zzbsfVar = zzbfwVarZzh2 != null ? new zzbsf(zzbfwVarZzh2) : null;
        } catch (RemoteException e9) {
            AbstractC7599p.m33329d("", e9);
        }
        this.zzc = zzbsfVar;
        try {
            if (this.zza.zzq() != null) {
                zzbsdVar = new zzbsd(this.zza.zzq());
            }
        } catch (RemoteException e10) {
            AbstractC7599p.m33329d("", e10);
        }
        this.zzd = zzbsdVar;
    }

    public final void cancelUnconfirmedClick() {
        try {
            this.zza.zzy();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("Failed to cancelUnconfirmedClick", e7);
        }
    }

    public final void destroy() {
        try {
            this.zza.zzp();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
    }

    public final void enableCustomClickGesture() {
        try {
            this.zza.zzD();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
    }

    public final NativeAd.AbstractC3516a getAdChoicesInfo() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getAdvertiser() {
        try {
            return this.zza.zzj();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getBody() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getCallToAction() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return null;
        }
    }

    public final Bundle getExtras() {
        try {
            Bundle bundleZzw = this.zza.zzw();
            if (bundleZzw != null) {
                return bundleZzw;
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getHeadline() {
        try {
            return this.zza.zze();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final NativeAd.AbstractC3517b getIcon() {
        return this.zzc;
    }

    public final List<NativeAd.AbstractC3517b> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final InterfaceC6562n getMediaContent() {
        try {
            zzbhq zzbhqVar = this.zza;
            if (zzbhqVar.zzF() != null) {
                return new C3255E1(zzbhqVar.zzF(), null);
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
        return null;
    }

    public final List<InterfaceC6564p> getMuteThisAdReasons() {
        return this.zze;
    }

    public final long getPlacementId() {
        long j7;
        AtomicLong atomicLong = this.zzf;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    long jZzK = this.zza.zzK();
                    AtomicLong atomicLong2 = this.zzf;
                    atomicLong2.set(jZzK);
                    j7 = atomicLong2.get();
                } catch (RemoteException e7) {
                    AbstractC7599p.m33329d("Failed to getPlacementId", e7);
                    return 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j7;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getPrice() {
        try {
            return this.zza.zzm();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final C6571w getResponseInfo() {
        InterfaceC3328c1 interfaceC3328c1ZzH;
        try {
            interfaceC3328c1ZzH = this.zza.zzH();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            interfaceC3328c1ZzH = null;
        }
        return C6571w.m27861e(interfaceC3328c1ZzH);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Double getStarRating() {
        try {
            double dZzk = this.zza.zzk();
            if (dZzk == -1.0d) {
                return null;
            }
            return Double.valueOf(dZzk);
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getStore() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return null;
        }
    }

    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.zza.zzG();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return false;
        }
    }

    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.zza.zzA();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return false;
        }
    }

    public final void muteThisAd(InterfaceC6564p interfaceC6564p) {
        try {
            try {
                if (this.zza.zzA()) {
                    if (interfaceC6564p == null) {
                        this.zza.zzB(null);
                        return;
                    } else if (interfaceC6564p instanceof C3275L0) {
                        this.zza.zzB(((C3275L0) interfaceC6564p).m17212a());
                        return;
                    } else {
                        AbstractC7599p.m33328c("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                        return;
                    }
                }
            } catch (RemoteException e7) {
                AbstractC7599p.m33329d("", e7);
            }
            AbstractC7599p.m33328c("Ad is not custom mute enabled");
        } catch (RemoteException e8) {
            AbstractC7599p.m33329d("", e8);
        }
    }

    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzr(bundle);
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
    }

    public final void recordCustomClickGesture() {
        try {
            this.zza.zzE();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    protected final void recordEvent(Bundle bundle) {
        try {
            this.zza.zzJ(bundle);
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("Failed to record native event", e7);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zza.zzs(bundle);
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zza.zzt(bundle);
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
    }

    public final void setMuteThisAdListener(InterfaceC6563o interfaceC6563o) {
        try {
            this.zza.zzC(new BinderC3263H0(interfaceC6563o));
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
    }

    public final void setOnPaidEventListener(InterfaceC6565q interfaceC6565q) {
        try {
            this.zza.zzI(new BinderC3293R1(interfaceC6565q));
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("Failed to setOnPaidEventListener", e7);
        }
    }

    public final void setPlacementId(long j7) {
        try {
            this.zza.zzL(j7);
            this.zzf.set(j7);
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("Failed to setPlacementId", e7);
        }
    }

    public final void setUnconfirmedClickListener(NativeAd.InterfaceC3519d interfaceC3519d) {
        try {
            this.zza.zzx(new zzbsm(interfaceC3519d));
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("Failed to setUnconfirmedClickListener", e7);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    protected final /* bridge */ /* synthetic */ Object zza() {
        try {
            return this.zza.zzu();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return null;
        }
    }
}
