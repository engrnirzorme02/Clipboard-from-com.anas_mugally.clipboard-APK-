package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.InterfaceC3494q0;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbyw {
    final String zzf;
    private final InterfaceC3494q0 zzk;
    long zza = -1;
    long zzb = -1;
    int zzc = -1;
    int zzd = -1;
    long zze = 0;
    private final Object zzj = new Object();
    int zzg = 0;
    int zzh = 0;
    int zzi = 0;

    public zzbyw(String str, InterfaceC3494q0 interfaceC3494q0) {
        this.zzf = str;
        this.zzk = interfaceC3494q0;
    }

    private final void zzi() {
        if (((Boolean) zzbep.zza.zze()).booleanValue()) {
            synchronized (this.zzj) {
                this.zzc--;
                this.zzd--;
            }
        }
    }

    public final void zza() {
        synchronized (this.zzj) {
            this.zzg++;
        }
    }

    public final void zzb() {
        synchronized (this.zzj) {
            this.zzh++;
        }
    }

    public final void zzc() {
        synchronized (this.zzj) {
            this.zzi++;
        }
    }

    public final int zzd() {
        int i7;
        synchronized (this.zzj) {
            i7 = this.zzi;
        }
        return i7;
    }

    public final void zze(C3349h2 c3349h2, long j7) {
        Bundle bundle;
        synchronized (this.zzj) {
            try {
                InterfaceC3494q0 interfaceC3494q0 = this.zzk;
                long jZzm = interfaceC3494q0.zzm();
                long jMo18159a = C7351t.m32357o().mo18159a();
                if (this.zzb == -1) {
                    if (jMo18159a - jZzm > ((Long) C3250D.m17200c().zzd(zzbci.zzbi)).longValue()) {
                        this.zzd = -1;
                    } else {
                        this.zzd = interfaceC3494q0.zzo();
                    }
                    this.zzb = j7;
                    this.zza = j7;
                } else {
                    this.zza = j7;
                }
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzea)).booleanValue() || (bundle = c3349h2.f13951c) == null || bundle.getInt("gw", 2) != 1) {
                    this.zzc++;
                    int i7 = this.zzd + 1;
                    this.zzd = i7;
                    if (i7 == 0) {
                        this.zze = 0L;
                        interfaceC3494q0.zzp(jMo18159a);
                    } else {
                        this.zze = jMo18159a - interfaceC3494q0.zzq();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzf() {
        zzi();
    }

    public final void zzg() {
        zzi();
    }

    public final Bundle zzh(Context context, String str) {
        Bundle bundle;
        synchronized (this.zzj) {
            try {
                bundle = new Bundle();
                if (!this.zzk.zzx()) {
                    bundle.putString("session_id", this.zzf);
                }
                bundle.putLong("basets", this.zzb);
                bundle.putLong("currts", this.zza);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.zzc);
                bundle.putInt("preqs_in_session", this.zzd);
                bundle.putLong("time_in_session", this.zze);
                bundle.putInt("pclick", this.zzg);
                bundle.putInt("pimp", this.zzh);
                Context contextZza = zzbvf.zza(context);
                int identifier = contextZza.getResources().getIdentifier("Theme.Translucent", "style", "android");
                boolean z7 = false;
                if (identifier == 0) {
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33330e("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == contextZza.getPackageManager().getActivityInfo(new ComponentName(contextZza.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                            z7 = true;
                        } else {
                            int i8 = AbstractC3490o0.f14278b;
                            AbstractC7599p.m33330e("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        int i9 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33331f("Fail to fetch AdActivity theme");
                        AbstractC7599p.m33330e("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                bundle.putBoolean("support_transparent_background", z7);
                bundle.putInt("consent_form_action_identifier", zzd());
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }
}
