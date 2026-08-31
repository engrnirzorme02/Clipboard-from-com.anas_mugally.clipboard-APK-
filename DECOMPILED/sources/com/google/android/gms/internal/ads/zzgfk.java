package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzgfk {
    public static final /* synthetic */ int zzb = 0;
    private static final zzggc zzc = new zzggc("OverlayDisplayService");
    private static final Intent zzd = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    final zzggb zza;
    private final String zze;

    zzgfk(Context context) {
        if (zzgge.zza(context)) {
            this.zza = new zzggb(context.getApplicationContext(), zzc, "OverlayDisplayService", zzd, zzgev.zza);
        } else {
            this.zza = null;
        }
        this.zze = context.getPackageName();
    }

    private static boolean zzh(String str) {
        return zzghs.zza(str).trim().isEmpty();
    }

    private static void zzi(String str, zzgfj zzgfjVar) {
        if (zzh(str)) {
            return;
        }
        str.getClass();
        zzgfjVar.zza(str.trim());
    }

    private static boolean zzj(zzgfp zzgfpVar, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!zzh((String) it.next())) {
                return true;
            }
        }
        zzc.zzc(str, new Object[0]);
        zzgfn zzgfnVarZzd = zzgfo.zzd();
        zzgfnVarZzd.zza(8160);
        zzgfpVar.zza(zzgfnVarZzd.zzd());
        return false;
    }

    final void zza(final zzgfm zzgfmVar, final zzgfp zzgfpVar) {
        zzggb zzggbVar = this.zza;
        if (zzggbVar == null) {
            zzc.zzc("error: %s", "Play Store not found.");
        } else if (zzj(zzgfpVar, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, zzgfmVar.zzb()))) {
            zzggbVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgfh
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zze(zzgfmVar, zzgfpVar);
                }
            });
        }
    }

    final void zzb(final zzger zzgerVar, final zzgfp zzgfpVar) {
        zzggb zzggbVar = this.zza;
        if (zzggbVar == null) {
            zzc.zzc("error: %s", "Play Store not found.");
        } else if (zzj(zzgfpVar, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(zzgerVar.zza(), zzgerVar.zzb()))) {
            zzggbVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgew
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzf(zzgerVar, zzgfpVar);
                }
            });
        }
    }

    final void zzc(final zzgfr zzgfrVar, final zzgfp zzgfpVar, final int i7) {
        zzggb zzggbVar = this.zza;
        if (zzggbVar == null) {
            zzc.zzc("error: %s", "Play Store not found.");
        } else if (zzj(zzgfpVar, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(zzgfrVar.zza(), zzgfrVar.zzb()))) {
            zzggbVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgey
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzg(zzgfrVar, i7, zzgfpVar);
                }
            });
        }
    }

    final void zzd() {
        zzggb zzggbVar = this.zza;
        if (zzggbVar == null) {
            return;
        }
        zzc.zza("unbind LMD display overlay service", new Object[0]);
        zzggbVar.zzb();
    }

    final /* synthetic */ void zze(zzgfm zzgfmVar, zzgfp zzgfpVar) {
        try {
            zzggb zzggbVar = this.zza;
            if (zzggbVar == null) {
                throw null;
            }
            zzgef zzgefVar = (zzgef) zzggbVar.zzc();
            if (zzgefVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putBinder("windowToken", zzgfmVar.zza());
            zzi(zzgfmVar.zzj(), new zzgfj() { // from class: com.google.android.gms.internal.ads.zzgez
                @Override // com.google.android.gms.internal.ads.zzgfj
                public final /* synthetic */ void zza(String str2) {
                    int i7 = zzgfk.zzb;
                    bundle.putString("adFieldEnifd", str2);
                }
            });
            bundle.putInt("layoutGravity", zzgfmVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzgfmVar.zzd());
            bundle.putInt("displayMode", 0);
            bundle.putInt("triggerMode", 0);
            bundle.putInt("windowWidthPx", zzgfmVar.zzh());
            zzi(null, new zzgfj() { // from class: com.google.android.gms.internal.ads.zzgfa
                @Override // com.google.android.gms.internal.ads.zzgfj
                public final /* synthetic */ void zza(String str2) {
                    int i7 = zzgfk.zzb;
                    bundle.putString("deeplinkUrl", str2);
                }
            });
            zzi(null, new zzgfj() { // from class: com.google.android.gms.internal.ads.zzgfb
                @Override // com.google.android.gms.internal.ads.zzgfj
                public final /* synthetic */ void zza(String str2) {
                    int i7 = zzgfk.zzb;
                    bundle.putString("sessionToken", str2);
                }
            });
            zzi(zzgfmVar.zzb(), new zzgfj() { // from class: com.google.android.gms.internal.ads.zzgfc
                @Override // com.google.android.gms.internal.ads.zzgfj
                public final /* synthetic */ void zza(String str2) {
                    int i7 = zzgfk.zzb;
                    bundle.putString("appId", str2);
                }
            });
            zzi(null, new zzgfj() { // from class: com.google.android.gms.internal.ads.zzgfd
                @Override // com.google.android.gms.internal.ads.zzgfj
                public final /* synthetic */ void zza(String str2) {
                    int i7 = zzgfk.zzb;
                    bundle.putString("thirdPartyAuthCallerId", str2);
                }
            });
            bundle.putBoolean("stableSessionToken", true);
            zzgefVar.zze(str, bundle, new zzgfi(this, zzgfpVar));
        } catch (RemoteException e7) {
            zzc.zzd(e7, "show overlay display from: %s", this.zze);
        }
    }

    final /* synthetic */ void zzf(zzger zzgerVar, zzgfp zzgfpVar) {
        try {
            zzggb zzggbVar = this.zza;
            if (zzggbVar == null) {
                throw null;
            }
            zzgef zzgefVar = (zzgef) zzggbVar.zzc();
            if (zzgefVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            zzi(zzgerVar.zza(), new zzgfj() { // from class: com.google.android.gms.internal.ads.zzgfe
                @Override // com.google.android.gms.internal.ads.zzgfj
                public final /* synthetic */ void zza(String str2) {
                    int i7 = zzgfk.zzb;
                    bundle.putString("sessionToken", str2);
                }
            });
            zzi(zzgerVar.zzb(), new zzgfj() { // from class: com.google.android.gms.internal.ads.zzgff
                @Override // com.google.android.gms.internal.ads.zzgfj
                public final /* synthetic */ void zza(String str2) {
                    int i7 = zzgfk.zzb;
                    bundle.putString("appId", str2);
                }
            });
            zzgefVar.zzf(bundle, new zzgfi(this, zzgfpVar));
        } catch (RemoteException e7) {
            zzc.zzd(e7, "dismiss overlay display from: %s", this.zze);
        }
    }

    final /* synthetic */ void zzg(zzgfr zzgfrVar, int i7, zzgfp zzgfpVar) {
        try {
            zzggb zzggbVar = this.zza;
            if (zzggbVar == null) {
                throw null;
            }
            zzgef zzgefVar = (zzgef) zzggbVar.zzc();
            if (zzgefVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putInt("displayMode", i7);
            zzi(zzgfrVar.zza(), new zzgfj() { // from class: com.google.android.gms.internal.ads.zzgfg
                @Override // com.google.android.gms.internal.ads.zzgfj
                public final /* synthetic */ void zza(String str2) {
                    int i8 = zzgfk.zzb;
                    bundle.putString("sessionToken", str2);
                }
            });
            zzi(zzgfrVar.zzb(), new zzgfj() { // from class: com.google.android.gms.internal.ads.zzgex
                @Override // com.google.android.gms.internal.ads.zzgfj
                public final /* synthetic */ void zza(String str2) {
                    int i8 = zzgfk.zzb;
                    bundle.putString("appId", str2);
                }
            });
            zzgefVar.zzg(bundle, new zzgfi(this, zzgfpVar));
        } catch (RemoteException e7) {
            zzc.zzd(e7, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i7), this.zze);
        }
    }
}
