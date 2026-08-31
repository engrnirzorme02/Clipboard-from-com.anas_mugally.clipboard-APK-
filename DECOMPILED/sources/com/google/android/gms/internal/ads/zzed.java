package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzed {
    private static zzed zza;
    private final Executor zzb;
    private final CopyOnWriteArrayList zzc;
    private final Object zzd;
    private int zze;
    private boolean zzf;

    private zzed(final Context context) {
        Executor executorZza = zzcv.zza();
        this.zzb = executorZza;
        this.zzc = new CopyOnWriteArrayList();
        this.zzd = new Object();
        this.zze = 0;
        executorZza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzea
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new zzec(this.zza, null), intentFilter);
            }
        });
    }

    public static synchronized zzed zza(Context context) {
        try {
            if (zza == null) {
                zza = new zzed(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }

    private final void zzg() {
        CopyOnWriteArrayList<zzdz> copyOnWriteArrayList = this.zzc;
        for (zzdz zzdzVar : copyOnWriteArrayList) {
            if (zzdzVar.zza()) {
                copyOnWriteArrayList.remove(zzdzVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zze(int i7) {
        zzg();
        synchronized (this.zzd) {
            try {
                if (this.zzf && this.zze == i7) {
                    return;
                }
                this.zzf = true;
                this.zze = i7;
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    ((zzdz) it.next()).zzb();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(zzdx zzdxVar, Executor executor) {
        boolean z7;
        zzg();
        zzdz zzdzVar = new zzdz(this, zzdxVar, executor);
        synchronized (this.zzd) {
            this.zzc.add(zzdzVar);
            z7 = this.zzf;
        }
        if (z7) {
            zzdzVar.zzb();
        }
    }

    public final int zzc() {
        int i7;
        synchronized (this.zzd) {
            i7 = this.zze;
        }
        return i7;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    final /* synthetic */ void zzd(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i7 = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    i7 = 1;
                } else {
                    int type = activeNetworkInfo.getType();
                    if (type == 0) {
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                                i7 = 3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                i7 = 4;
                                break;
                            case 13:
                                i7 = 5;
                                break;
                            case 16:
                            case 19:
                            default:
                                i7 = 6;
                                break;
                            case 18:
                                i7 = 2;
                                break;
                            case 20:
                                if (Build.VERSION.SDK_INT >= 29) {
                                    i7 = 9;
                                }
                                break;
                        }
                    } else if (type == 1) {
                        i7 = 2;
                    } else if (type == 4 || type == 5) {
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                                i7 = 3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                i7 = 4;
                                break;
                            case 13:
                                i7 = 5;
                                break;
                            case 16:
                            case 19:
                            default:
                                i7 = 6;
                                break;
                            case 18:
                                i7 = 2;
                                break;
                            case 20:
                                if (Build.VERSION.SDK_INT >= 29) {
                                    i7 = 9;
                                }
                                break;
                        }
                    } else if (type != 6) {
                        i7 = type != 9 ? 8 : 7;
                    } else {
                        i7 = 5;
                    }
                }
            } catch (SecurityException unused) {
            }
        }
        if (Build.VERSION.SDK_INT < 31 || i7 != 5) {
            zze(i7);
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                throw null;
            }
            zzdw zzdwVar = new zzdw(this);
            telephonyManager.registerTelephonyCallback(this.zzb, zzdwVar);
            telephonyManager.unregisterTelephonyCallback(zzdwVar);
        } catch (RuntimeException unused2) {
            zze(5);
        }
    }

    final /* synthetic */ Executor zzf() {
        return this.zzb;
    }
}
