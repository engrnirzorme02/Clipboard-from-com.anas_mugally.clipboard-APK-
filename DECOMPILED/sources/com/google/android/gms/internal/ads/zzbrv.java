package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.common.util.AbstractC3751f;
import java.util.Map;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7590g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbrv extends zzbsb {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzcek zzj;
    private final Activity zzk;
    private zzcgt zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbsc zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        AbstractC3751f.m18167f("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    }

    public zzbrv(zzcek zzcekVar, zzbsc zzbscVar) {
        super(zzcekVar, "resize");
        this.zza = "top-right";
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzcekVar;
        this.zzk = zzcekVar.zzj();
        this.zzo = zzbscVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzf(boolean z7) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlF)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlG)).booleanValue()) {
            View view = (View) this.zzj;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlH)).booleanValue()) {
                try {
                    ViewGroup viewGroup2 = this.zzr;
                    zzcek zzcekVar = this.zzj;
                    viewGroup2.addView((View) zzcekVar);
                    zzcekVar.zzaf(this.zzl);
                } catch (IllegalStateException e7) {
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33329d("Unable to add webview back to view hierarchy.", e7);
                }
            } else {
                ViewGroup viewGroup3 = this.zzr;
                zzcek zzcekVar2 = this.zzj;
                viewGroup3.addView((View) zzcekVar2);
                zzcekVar2.zzaf(this.zzl);
            }
        }
        if (z7) {
            zzk("default");
            zzbsc zzbscVar = this.zzo;
            if (zzbscVar != null) {
                zzbscVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x019b A[PHI: r18
      0x019b: PHI (r18v12 int) = (r18v5 int), (r18v6 int), (r18v7 int), (r18v8 int), (r18v9 int), (r18v10 int), (r18v13 int) binds: [B:85:0x0197, B:82:0x018a, B:79:0x017e, B:76:0x0172, B:73:0x0166, B:70:0x015a, B:68:0x014f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zza(Map map) {
        int i7;
        int i8;
        byte b7;
        int i9;
        int i10;
        int i11;
        int i12;
        synchronized (this.zzi) {
            try {
                Activity activity = this.zzk;
                if (activity == null) {
                    zzg("Not an activity context. Cannot resize.");
                    return;
                }
                zzcek zzcekVar = this.zzj;
                if (zzcekVar.zzN() == null) {
                    zzg("Webview is not yet available, size is not set.");
                    return;
                }
                if (zzcekVar.zzN().zzg()) {
                    zzg("Is interstitial. Cannot resize an interstitial.");
                    return;
                }
                if (zzcekVar.zzW()) {
                    zzg("Cannot resize an expanded banner.");
                    return;
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                    C7351t.m32349g();
                    this.zzh = C3431F0.m17429t((String) map.get("width"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                    C7351t.m32349g();
                    this.zze = C3431F0.m17429t((String) map.get("height"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                    C7351t.m32349g();
                    this.zzf = C3431F0.m17429t((String) map.get("offsetX"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                    C7351t.m32349g();
                    this.zzg = C3431F0.m17429t((String) map.get("offsetY"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                    this.zzb = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                }
                String str = (String) map.get("customClosePosition");
                if (!TextUtils.isEmpty(str)) {
                    this.zza = str;
                }
                if (this.zzh < 0 || this.zze < 0) {
                    zzg("Invalid width and height options. Cannot resize.");
                    return;
                }
                Window window = activity.getWindow();
                if (window != null && window.getDecorView() != null) {
                    C7351t.m32349g();
                    int[] iArrM17386B = C3431F0.m17386B(activity);
                    C7351t.m32349g();
                    int[] iArrM17432w = C3431F0.m17432w(activity);
                    int i13 = iArrM17386B[0];
                    int i14 = iArrM17386B[1];
                    int i15 = this.zzh;
                    int[] iArr = null;
                    if (i15 < 50 || i15 > i13) {
                        i7 = 50;
                        int i16 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33331f("Width is too small or too large.");
                    } else {
                        int i17 = this.zze;
                        if (i17 < 50 || i17 > i14) {
                            i7 = 50;
                            int i18 = AbstractC3490o0.f14278b;
                            AbstractC7599p.m33331f("Height is too small or too large.");
                        } else if (i17 == i14 && i15 == i13) {
                            int i19 = AbstractC3490o0.f14278b;
                            AbstractC7599p.m33331f("Cannot resize to a full-screen ad.");
                            i7 = 50;
                        } else if (this.zzb) {
                            String str2 = this.zza;
                            switch (str2.hashCode()) {
                                case -1364013995:
                                    i7 = 50;
                                    if (!str2.equals("center")) {
                                        b7 = -1;
                                    } else {
                                        b7 = 2;
                                    }
                                    break;
                                case -1012429441:
                                    i7 = 50;
                                    if (!str2.equals("top-left")) {
                                        b7 = -1;
                                    } else {
                                        b7 = 0;
                                    }
                                    break;
                                case -655373719:
                                    i7 = 50;
                                    if (!str2.equals("bottom-left")) {
                                        b7 = -1;
                                    } else {
                                        b7 = 3;
                                    }
                                    break;
                                case 1163912186:
                                    i7 = 50;
                                    if (!str2.equals("bottom-right")) {
                                        b7 = -1;
                                    } else {
                                        b7 = 5;
                                    }
                                    break;
                                case 1288627767:
                                    i7 = 50;
                                    if (!str2.equals("bottom-center")) {
                                        b7 = -1;
                                    } else {
                                        b7 = 4;
                                    }
                                    break;
                                case 1755462605:
                                    i7 = 50;
                                    if (!str2.equals("top-center")) {
                                        b7 = -1;
                                    } else {
                                        b7 = 1;
                                    }
                                    break;
                                default:
                                    i7 = 50;
                                    b7 = -1;
                                    break;
                            }
                            if (b7 == 0) {
                                i9 = this.zzc + this.zzf;
                                i10 = this.zzd;
                            } else if (b7 != 1) {
                                if (b7 != 2) {
                                    if (b7 == 3) {
                                        i9 = this.zzc + this.zzf;
                                        i12 = this.zzd;
                                    } else if (b7 == 4) {
                                        i9 = ((this.zzc + this.zzf) + (i15 >> 1)) - 25;
                                        i12 = this.zzd;
                                    } else if (b7 != 5) {
                                        i9 = ((this.zzc + this.zzf) + i15) - 50;
                                        i10 = this.zzd;
                                    } else {
                                        i9 = ((this.zzc + this.zzf) + i15) - 50;
                                        i12 = this.zzd;
                                    }
                                    i11 = ((i12 + this.zzg) + i17) - 50;
                                } else {
                                    i9 = ((this.zzc + this.zzf) + (i15 >> 1)) - 25;
                                    i11 = ((this.zzd + this.zzg) + (i17 >> 1)) - 25;
                                }
                                if (i9 >= 0 && i9 + 50 <= i13 && i11 >= iArrM17432w[0] && i11 + 50 <= iArrM17432w[1]) {
                                    iArr = new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                                }
                            } else {
                                i9 = ((this.zzc + this.zzf) + (i15 >> 1)) - 25;
                                i10 = this.zzd;
                            }
                            i11 = i10 + this.zzg;
                            if (i9 >= 0) {
                                iArr = new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                            }
                        } else {
                            i7 = 50;
                            C7351t.m32349g();
                            int[] iArrM17386B2 = C3431F0.m17386B(activity);
                            C7351t.m32349g();
                            int[] iArrM17432w2 = C3431F0.m17432w(activity);
                            int i20 = iArrM17386B2[0];
                            int i21 = this.zzc + this.zzf;
                            int i22 = this.zzd + this.zzg;
                            if (i21 < 0) {
                                i8 = 0;
                            } else {
                                int i23 = this.zzh;
                                i8 = i21 + i23 > i20 ? i20 - i23 : i21;
                            }
                            int i24 = iArrM17432w2[0];
                            if (i22 < i24) {
                                i22 = i24;
                            } else {
                                int i25 = this.zze;
                                int i26 = i22 + i25;
                                int i27 = iArrM17432w2[1];
                                if (i26 > i27) {
                                    i22 = i27 - i25;
                                }
                            }
                            iArr = new int[]{i8, i22};
                        }
                    }
                    if (iArr == null) {
                        zzg("Resize location out of screen or close button is not visible.");
                        return;
                    }
                    C3244B.m17190a();
                    int iM33276c = C7590g.m33276c(activity, this.zzh);
                    C3244B.m17190a();
                    int iM33276c2 = C7590g.m33276c(activity, this.zze);
                    ViewParent parent = ((View) zzcekVar).getParent();
                    if (!(parent instanceof ViewGroup)) {
                        zzg("Webview is detached, probably in the middle of a resize or expand.");
                        return;
                    }
                    ViewGroup viewGroup = (ViewGroup) parent;
                    viewGroup.removeView((View) zzcekVar);
                    PopupWindow popupWindow = this.zzp;
                    if (popupWindow == null) {
                        this.zzr = viewGroup;
                        C7351t.m32349g();
                        ((View) zzcekVar).setDrawingCacheEnabled(true);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((View) zzcekVar).getDrawingCache());
                        ((View) zzcekVar).setDrawingCacheEnabled(false);
                        ImageView imageView = new ImageView(activity);
                        this.zzm = imageView;
                        imageView.setImageBitmap(bitmapCreateBitmap);
                        this.zzl = zzcekVar.zzN();
                        this.zzr.addView(this.zzm);
                    } else {
                        popupWindow.dismiss();
                    }
                    RelativeLayout relativeLayout = new RelativeLayout(activity);
                    this.zzq = relativeLayout;
                    relativeLayout.setBackgroundColor(0);
                    this.zzq.setLayoutParams(new ViewGroup.LayoutParams(iM33276c, iM33276c2));
                    C7351t.m32349g();
                    PopupWindow popupWindow2 = new PopupWindow((View) this.zzq, iM33276c, iM33276c2, false);
                    this.zzp = popupWindow2;
                    popupWindow2.setOutsideTouchable(false);
                    this.zzp.setTouchable(true);
                    this.zzp.setClippingEnabled(!this.zzb);
                    byte b8 = -1;
                    this.zzq.addView((View) zzcekVar, -1, -1);
                    this.zzn = new LinearLayout(activity);
                    C3244B.m17190a();
                    int i28 = i7;
                    int iM33276c3 = C7590g.m33276c(activity, i28);
                    C3244B.m17190a();
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iM33276c3, C7590g.m33276c(activity, i28));
                    String str3 = this.zza;
                    switch (str3.hashCode()) {
                        case -1364013995:
                            if (str3.equals("center")) {
                                b8 = 2;
                            }
                            break;
                        case -1012429441:
                            if (str3.equals("top-left")) {
                                b8 = 0;
                            }
                            break;
                        case -655373719:
                            if (str3.equals("bottom-left")) {
                                b8 = 3;
                            }
                            break;
                        case 1163912186:
                            if (str3.equals("bottom-right")) {
                                b8 = 5;
                            }
                            break;
                        case 1288627767:
                            if (str3.equals("bottom-center")) {
                                b8 = 4;
                            }
                            break;
                        case 1755462605:
                            if (str3.equals("top-center")) {
                                b8 = 1;
                            }
                            break;
                    }
                    if (b8 == 0) {
                        layoutParams.addRule(10);
                        layoutParams.addRule(9);
                    } else if (b8 == 1) {
                        layoutParams.addRule(10);
                        layoutParams.addRule(14);
                    } else if (b8 == 2) {
                        layoutParams.addRule(13);
                    } else if (b8 == 3) {
                        layoutParams.addRule(12);
                        layoutParams.addRule(9);
                    } else if (b8 == 4) {
                        layoutParams.addRule(12);
                        layoutParams.addRule(14);
                    } else if (b8 != 5) {
                        layoutParams.addRule(10);
                        layoutParams.addRule(11);
                    } else {
                        layoutParams.addRule(12);
                        layoutParams.addRule(11);
                    }
                    this.zzn.setOnClickListener(new zzbrt(this));
                    this.zzn.setContentDescription("Close button");
                    this.zzq.addView(this.zzn, layoutParams);
                    try {
                        PopupWindow popupWindow3 = this.zzp;
                        View decorView = window.getDecorView();
                        C3244B.m17190a();
                        int iM33276c4 = C7590g.m33276c(activity, iArr[0]);
                        C3244B.m17190a();
                        popupWindow3.showAtLocation(decorView, 0, iM33276c4, C7590g.m33276c(activity, iArr[1]));
                        int i29 = iArr[0];
                        int i30 = iArr[1];
                        zzbsc zzbscVar = this.zzo;
                        if (zzbscVar != null) {
                            zzbscVar.zza(i29, i30, this.zzh, this.zze);
                        }
                        this.zzj.zzaf(zzcgt.zzc(iM33276c, iM33276c2));
                        int i31 = iArr[0];
                        int i32 = iArr[1];
                        C7351t.m32349g();
                        zzi(i31, i32 - C3431F0.m17432w(this.zzk)[0], this.zzh, this.zze);
                        zzk("resized");
                        return;
                    } catch (RuntimeException e7) {
                        String message = e7.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                        sb.append("Cannot show popup window: ");
                        sb.append(message);
                        zzg(sb.toString());
                        RelativeLayout relativeLayout2 = this.zzq;
                        zzcek zzcekVar2 = this.zzj;
                        relativeLayout2.removeView((View) zzcekVar2);
                        ViewGroup viewGroup2 = this.zzr;
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(this.zzm);
                            this.zzr.addView((View) zzcekVar2);
                            zzcekVar2.zzaf(this.zzl);
                        }
                        return;
                    }
                }
                zzg("Activity context is not ready, cannot get window or decor view.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(final boolean z7) {
        synchronized (this.zzi) {
            try {
                if (this.zzp != null) {
                    if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzlE)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        zzf(z7);
                    } else {
                        zzbzh.zzf.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbru
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzf(z7);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(int i7, int i8, boolean z7) {
        synchronized (this.zzi) {
            this.zzc = i7;
            this.zzd = i8;
        }
    }

    public final boolean zzd() {
        boolean z7;
        synchronized (this.zzi) {
            z7 = this.zzp != null;
        }
        return z7;
    }

    public final void zze(int i7, int i8) {
        this.zzc = i7;
        this.zzd = i8;
    }
}
