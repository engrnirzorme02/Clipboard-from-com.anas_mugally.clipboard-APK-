package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3369m2;
import p033E.C0247b;
import p111O.AbstractC1030Z;
import p111O.C0982A0;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzena implements zzeup {
    private final zzeup zza;
    private final zzfdc zzb;
    private final Context zzc;
    private final zzbyv zzd;

    zzena(zzepd zzepdVar, zzfdc zzfdcVar, Context context, zzbyv zzbyvVar) {
        this.zza = zzepdVar;
        this.zzb = zzfdcVar;
        this.zzc = context;
        this.zzd = zzbyvVar;
    }

    private final C0247b zzd(float f7) {
        Window window;
        View decorView;
        C0982A0 c0982a0M4433E;
        if (f7 == 0.0f) {
            return C0247b.f983e;
        }
        C0247b c0247bM4272f = C0247b.f983e;
        if (Build.VERSION.SDK_INT >= 30) {
            WindowManager windowManager = (WindowManager) this.zzc.getSystemService("window");
            if (windowManager != null) {
                c0247bM4272f = C0247b.m1186d(windowManager.getCurrentWindowMetrics().getWindowInsets().getInsets(WindowInsets.Type.statusBars() | WindowInsets.Type.displayCutout() | WindowInsets.Type.navigationBars() | WindowInsets.Type.captionBar()));
            }
        } else {
            Activity activityZzd = C7351t.m32353k().zzd();
            if (activityZzd != null && (window = activityZzd.getWindow()) != null && (decorView = window.getDecorView()) != null && (c0982a0M4433E = AbstractC1030Z.m4433E(decorView)) != null) {
                c0247bM4272f = c0982a0M4433E.m4272f(C0982A0.p.m4332e() | C0982A0.p.m4328a());
            }
        }
        return C0247b.m1184b((int) Math.ceil(c0247bM4272f.f984a / f7), (int) Math.ceil(c0247bM4272f.f985b / f7), (int) Math.ceil(c0247bM4272f.f986c / f7), (int) Math.ceil(c0247bM4272f.f987d / f7));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        return zzgot.zzk(this.zza.zza(), new zzggr() { // from class: com.google.android.gms.internal.ads.zzemz
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((zzeuy) obj);
            }
        }, zzbzh.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 7;
    }

    final /* synthetic */ zzenb zzc(zzeuy zzeuyVar) {
        String str;
        boolean z7;
        int i7;
        String strZzu;
        float f7;
        int i8;
        int i9;
        int i10;
        WindowManager windowManager;
        int iWidth;
        int iHeight;
        DisplayMetrics displayMetrics;
        zzfdc zzfdcVar = this.zzb;
        C3369m2 c3369m2 = zzfdcVar.zzf;
        C3369m2[] c3369m2Arr = c3369m2.f14028r;
        if (c3369m2Arr != null) {
            str = null;
            z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            for (C3369m2 c3369m3 : c3369m2Arr) {
                boolean z10 = c3369m3.f14030t;
                if (!z10 && !z8) {
                    str = c3369m3.f14022a;
                    z8 = true;
                }
                if (z10) {
                    if (!z9) {
                        z7 = true;
                    }
                    z9 = true;
                }
                if (z8 && z9) {
                    break;
                }
            }
        } else {
            str = c3369m2.f14022a;
            z7 = c3369m2.f14030t;
        }
        Context context = this.zzc;
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            i7 = 0;
            strZzu = null;
            f7 = 0.0f;
            i8 = 0;
        } else {
            zzbyv zzbyvVar = this.zzd;
            f7 = displayMetrics.density;
            i8 = displayMetrics.widthPixels;
            i7 = displayMetrics.heightPixels;
            strZzu = zzbyvVar.zzo().zzu();
        }
        C0247b c0247bZzd = (!((Boolean) C3250D.m17200c().zzd(zzbci.zzoe)).booleanValue() || Build.VERSION.SDK_INT < 35) ? null : zzd(f7);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzof)).booleanValue() && (i10 = Build.VERSION.SDK_INT) <= 34 && i10 >= 28 && (windowManager = (WindowManager) context.getSystemService("window")) != null) {
            if (i10 >= 30) {
                WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                iWidth = currentWindowMetrics.getBounds().width();
                iHeight = currentWindowMetrics.getBounds().height();
            } else {
                Point point = new Point();
                windowManager.getDefaultDisplay().getRealSize(point);
                iWidth = point.x;
                iHeight = point.y;
            }
            i7 = iHeight;
            i8 = iWidth;
            c0247bZzd = zzd(f7);
        }
        int i11 = i7;
        StringBuilder sb = new StringBuilder();
        if (c3369m2Arr != null) {
            boolean z11 = false;
            for (C3369m2 c3369m4 : c3369m2Arr) {
                if (c3369m4.f14030t) {
                    z11 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i12 = c3369m4.f14026e;
                    if (i12 == -1) {
                        i12 = f7 != 0.0f ? (int) (c3369m4.f14027f / f7) : -1;
                    }
                    sb.append(i12);
                    sb.append("x");
                    int i13 = c3369m4.f14023b;
                    if (i13 == -2) {
                        i13 = f7 != 0.0f ? (int) (c3369m4.f14024c / f7) : -2;
                    }
                    sb.append(i13);
                }
            }
            if (z11) {
                if (sb.length() != 0) {
                    i9 = 0;
                    sb.insert(0, "|");
                } else {
                    i9 = 0;
                }
                sb.insert(i9, "320x50");
            }
        }
        return new zzenb(c3369m2, str, z7, sb.toString(), f7, i8, i11, strZzu, zzfdcVar.zzr, c0247bZzd);
    }
}
