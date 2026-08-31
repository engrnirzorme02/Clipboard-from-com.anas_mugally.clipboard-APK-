package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.HashMap;
import p364u2.AbstractC7158d;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcar extends FrameLayout implements zzcai {
    final zzcbf zza;
    private final zzcbd zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbcx zze;
    private final long zzf;
    private final zzcaj zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzcar(Context context, zzcbd zzcbdVar, int i7, boolean z7, zzbcx zzbcxVar, zzcbc zzcbcVar, zzdsm zzdsmVar) {
        zzcaj zzcahVar;
        zzbcx zzbcxVar2;
        zzcaj zzcdzVar;
        super(context);
        this.zzb = zzcbdVar;
        this.zze = zzbcxVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        AbstractC3718s.m18083l(zzcbdVar.zzk());
        zzcak zzcakVar = zzcbdVar.zzk().f29185a;
        zzcbe zzcbeVar = new zzcbe(context, zzcbdVar.zzs(), zzcbdVar.zzm(), zzbcxVar, zzcbdVar.zzi());
        if (i7 == 3) {
            zzcdzVar = new zzcdz(context, zzcbeVar);
            zzbcxVar2 = zzbcxVar;
        } else {
            if (i7 == 2) {
                zzcahVar = new zzcbv(context, zzcbeVar, zzcbdVar, z7, zzcak.zza(zzcbdVar), zzcbcVar, zzdsmVar);
                zzbcxVar2 = zzbcxVar;
            } else {
                zzbcxVar2 = zzbcxVar;
                zzcahVar = new zzcah(context, zzcbdVar, z7, zzcak.zza(zzcbdVar), zzcbcVar, new zzcbe(context, zzcbdVar.zzs(), zzcbdVar.zzm(), zzbcxVar, zzcbdVar.zzi()), zzdsmVar);
            }
            zzcdzVar = zzcahVar;
        }
        this.zzg = zzcdzVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcdzVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzY)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzV)).booleanValue()) {
            zzD();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) C3250D.m17200c().zzd(zzbci.zzaa)).longValue();
        boolean zBooleanValue = ((Boolean) C3250D.m17200c().zzd(zzbci.zzX)).booleanValue();
        this.zzk = zBooleanValue;
        if (zzbcxVar2 != null) {
            zzbcxVar2.zzd("spinner_used", true != zBooleanValue ? "0" : "1");
        }
        this.zza = new zzcbf(this);
        zzcdzVar.zzb(this);
    }

    private final boolean zzJ() {
        return this.zzq.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzK, reason: merged with bridge method [inline-methods] */
    public final void zzI(String str, String... strArr) {
        HashMap map = new HashMap();
        Integer numZzl = zzl();
        if (numZzl != null) {
            map.put("playerId", numZzl.toString());
        }
        map.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zze("onVideoEvent", map);
    }

    private final void zzL() {
        zzcbd zzcbdVar = this.zzb;
        if (zzcbdVar.zzj() == null || !this.zzi || this.zzj) {
            return;
        }
        zzcbdVar.zzj().getWindow().clearFlags(128);
        this.zzi = false;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzcaj zzcajVar = this.zzg;
            if (zzcajVar != null) {
                zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcao
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzcajVar.zzd();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z7) {
        super.onWindowFocusChanged(z7);
        if (z7) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcaq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG(z7);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcai
    public final void onWindowVisibilityChanged(int i7) {
        boolean z7;
        super.onWindowVisibilityChanged(i7);
        if (i7 == 0) {
            this.zza.zzb();
            z7 = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z7 = false;
        }
        C3431F0.f14180l.post(new zzcan(this, z7));
    }

    public final void zzA(int i7) {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        zzcajVar.zzB(i7);
    }

    public final void zzB(int i7) {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        zzcajVar.zzC(i7);
    }

    public final void zzC(MotionEvent motionEvent) {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        zzcajVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzD() {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        TextView textView = new TextView(zzcajVar.getContext());
        Resources resourcesZzf = C7351t.m32354l().zzf();
        textView.setText(String.valueOf(resourcesZzf == null ? "AdMob - " : resourcesZzf.getString(AbstractC7158d.f28606u)).concat(zzcajVar.zza()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout frameLayout = this.zzc;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.bringChildToFront(textView);
    }

    public final void zzE() {
        this.zza.zza();
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar != null) {
            zzcajVar.zzd();
        }
        zzL();
    }

    final void zzF() {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        long jZzh = zzcajVar.zzh();
        if (this.zzl == jZzh || jZzh <= 0) {
            return;
        }
        float f7 = jZzh / 1000.0f;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcd)).booleanValue()) {
            zzI("timeupdate", "time", String.valueOf(f7), "totalBytes", String.valueOf(zzcajVar.zzo()), "qoeCachedBytes", String.valueOf(zzcajVar.zzn()), "qoeLoadedBytes", String.valueOf(zzcajVar.zzm()), "droppedFrames", String.valueOf(zzcajVar.zzp()), "reportTime", String.valueOf(C7351t.m32357o().mo18159a()));
        } else {
            zzI("timeupdate", "time", String.valueOf(f7));
        }
        this.zzl = jZzh;
    }

    final /* synthetic */ void zzG(boolean z7) {
        zzI("windowFocusChanged", "hasWindowFocus", String.valueOf(z7));
    }

    final /* synthetic */ void zzH() {
        zzI("firstFrameRendered", new String[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zza() {
        this.zza.zzb();
        C3431F0.f14180l.post(new zzcal(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzb() {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar != null && this.zzm == 0) {
            zzI("canplaythrough", "duration", String.valueOf(zzcajVar.zzg() / 1000.0f), "videoWidth", String.valueOf(zzcajVar.zzk()), "videoHeight", String.valueOf(zzcajVar.zzl()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzc() {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcf)).booleanValue()) {
            this.zza.zzb();
        }
        zzcbd zzcbdVar = this.zzb;
        if (zzcbdVar.zzj() != null && !this.zzi) {
            boolean z7 = (zzcbdVar.zzj().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z7;
            if (!z7) {
                zzcbdVar.zzj().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzd() {
        zzI("pause", new String[0]);
        zzL();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zze() {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcf)).booleanValue()) {
            this.zza.zza();
        }
        zzI("ended", new String[0]);
        zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzf(String str, String str2) {
        zzI("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzg(String str, String str2) {
        zzI("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzh() {
        if (this.zzr && this.zzp != null && !zzJ()) {
            ImageView imageView = this.zzq;
            imageView.setImageBitmap(this.zzp);
            imageView.invalidate();
            FrameLayout frameLayout = this.zzc;
            frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(imageView);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        C3431F0.f14180l.post(new zzcam(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzi() {
        if (this.zzh && zzJ()) {
            this.zzc.removeView(this.zzq);
        }
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null || this.zzp == null) {
            return;
        }
        long jMo18161c = C7351t.m32357o().mo18161c();
        if (zzcajVar.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long jMo18161c2 = C7351t.m32357o().mo18161c() - jMo18161c;
        if (AbstractC3490o0.m17547m()) {
            StringBuilder sb = new StringBuilder(String.valueOf(jMo18161c2).length() + 26);
            sb.append("Spinner frame grab took ");
            sb.append(jMo18161c2);
            sb.append("ms");
            AbstractC3490o0.m17545k(sb.toString());
        }
        if (jMo18161c2 > this.zzf) {
            AbstractC7599p.m33331f("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbcx zzbcxVar = this.zze;
            if (zzbcxVar != null) {
                zzbcxVar.zzd("spinner_jank", Long.toString(jMo18161c2));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzj(int i7, int i8) {
        if (this.zzk) {
            zzbbz zzbbzVar = zzbci.zzZ;
            int iMax = Math.max(i7 / ((Integer) C3250D.m17200c().zzd(zzbbzVar)).intValue(), 1);
            int iMax2 = Math.max(i8 / ((Integer) C3250D.m17200c().zzd(zzbbzVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == iMax && this.zzp.getHeight() == iMax2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzk() {
        this.zzd.setVisibility(4);
        C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcap
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzH();
            }
        });
    }

    public final Integer zzl() {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar != null) {
            return zzcajVar.zzw();
        }
        return null;
    }

    public final void zzm(int i7) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzY)).booleanValue()) {
            this.zzc.setBackgroundColor(i7);
            this.zzd.setBackgroundColor(i7);
        }
    }

    public final void zzn(int i7, int i8, int i9, int i10) {
        if (AbstractC3490o0.m17547m()) {
            int length = String.valueOf(i7).length();
            StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(i8).length() + 3 + String.valueOf(i9).length() + 3 + String.valueOf(i10).length());
            sb.append("Set video bounds to x:");
            sb.append(i7);
            sb.append(";y:");
            sb.append(i8);
            sb.append(";w:");
            sb.append(i9);
            sb.append(";h:");
            sb.append(i10);
            AbstractC3490o0.m17545k(sb.toString());
        }
        if (i9 == 0 || i10 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i9, i10);
        layoutParams.setMargins(i7, i8, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzo(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzp(float f7, float f8) {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar != null) {
            zzcajVar.zzj(f7, f8);
        }
    }

    public final void zzq(Integer num) {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzn)) {
            zzI("no_src", new String[0]);
        } else {
            zzcajVar.zzx(this.zzn, this.zzo, num);
        }
    }

    public final void zzr() {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        zzcajVar.zzf();
    }

    public final void zzs() {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        zzcajVar.zze();
    }

    public final void zzt(int i7) {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        zzcajVar.zzi(i7);
    }

    public final void zzu() {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        zzcajVar.zzb.zza(true);
        zzcajVar.zzq();
    }

    public final void zzv() {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        zzcajVar.zzb.zza(false);
        zzcajVar.zzq();
    }

    public final void zzw(float f7) {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        zzcajVar.zzb.zzb(f7);
        zzcajVar.zzq();
    }

    public final void zzx(int i7) {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        zzcajVar.zzy(i7);
    }

    public final void zzy(int i7) {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        zzcajVar.zzz(i7);
    }

    public final void zzz(int i7) {
        zzcaj zzcajVar = this.zzg;
        if (zzcajVar == null) {
            return;
        }
        zzcajVar.zzA(i7);
    }
}
