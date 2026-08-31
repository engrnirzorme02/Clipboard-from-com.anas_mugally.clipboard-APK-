package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.common.internal.AbstractC3686c;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbap {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzbal(this);
    private final Object zzc = new Object();
    private zzbas zzd;
    private Context zze;
    private zzbav zzf;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final void zzf() {
        synchronized (this.zzc) {
            try {
                if (this.zze != null && this.zzd == null) {
                    zzbas zzbasVarZze = zze(new zzban(this), new zzbao(this));
                    this.zzd = zzbasVarZze;
                    zzbasVarZze.checkAvailabilityAndConnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            try {
                if (this.zze != null) {
                    return;
                }
                this.zze = context.getApplicationContext();
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzeJ)).booleanValue()) {
                    zzf();
                } else {
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zzeI)).booleanValue()) {
                        C7351t.m32353k().zzb(new zzbam(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb() {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzeK)).booleanValue()) {
            synchronized (this.zzc) {
                try {
                    zzf();
                    ScheduledFuture scheduledFuture = this.zza;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.zza = zzbzh.zzd.schedule(this.zzb, ((Long) C3250D.m17200c().zzd(zzbci.zzeL)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final zzbaq zzc(zzbat zzbatVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzbaq();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzf(zzbatVar);
                }
                return this.zzf.zze(zzbatVar);
            } catch (RemoteException e7) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("Unable to call into cache service.", e7);
                return new zzbaq();
            }
        }
    }

    public final long zzd(zzbat zzbatVar) {
        synchronized (this.zzc) {
            try {
                if (this.zzf == null) {
                    return -2L;
                }
                if (this.zzd.zzp()) {
                    try {
                        return this.zzf.zzg(zzbatVar);
                    } catch (RemoteException e7) {
                        int i7 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33329d("Unable to call into cache service.", e7);
                    }
                }
                return -2L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final synchronized zzbas zze(AbstractC3686c.a aVar, AbstractC3686c.b bVar) {
        return new zzbas(this.zze, C7351t.m32365w().m17489a(), aVar, bVar);
    }

    final /* synthetic */ void zzg() {
        synchronized (this.zzc) {
            try {
                zzbas zzbasVar = this.zzd;
                if (zzbasVar == null) {
                    return;
                }
                if (zzbasVar.isConnected() || this.zzd.isConnecting()) {
                    this.zzd.disconnect();
                }
                this.zzd = null;
                this.zzf = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ Object zzh() {
        return this.zzc;
    }

    final /* synthetic */ zzbas zzi() {
        return this.zzd;
    }

    final /* synthetic */ void zzj(zzbas zzbasVar) {
        this.zzd = null;
    }

    final /* synthetic */ void zzk(zzbav zzbavVar) {
        this.zzf = zzbavVar;
    }
}
