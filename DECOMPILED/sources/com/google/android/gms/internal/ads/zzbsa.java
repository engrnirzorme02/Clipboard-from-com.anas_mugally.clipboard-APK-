package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7590g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbsa extends zzbsb implements zzbjl {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzcek zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbbp zzk;
    private float zzl;
    private int zzm;

    public zzbsa(zzcek zzcekVar, Context context, zzbbp zzbbpVar) {
        super(zzcekVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcekVar;
        this.zzi = context;
        this.zzk = zzbbpVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectPut;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        C3244B.m17190a();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = C7590g.m33274a(displayMetrics, displayMetrics.widthPixels);
        C3244B.m17190a();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = C7590g.m33274a(displayMetrics2, displayMetrics2.heightPixels);
        zzcek zzcekVar = this.zzh;
        Activity activityZzj = zzcekVar.zzj();
        if (activityZzj == null || activityZzj.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            C7351t.m32349g();
            int[] iArrM17431v = C3431F0.m17431v(activityZzj);
            C3244B.m17190a();
            this.zzd = C7590g.m33274a(this.zza, iArrM17431v[0]);
            C3244B.m17190a();
            this.zze = C7590g.m33274a(this.zza, iArrM17431v[1]);
        }
        if (zzcekVar.zzN().zzg()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            zzcekVar.measure(0, 0);
        }
        zzl(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbrz zzbrzVar = new zzbrz();
        zzbbp zzbbpVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbrzVar.zzb(zzbbpVar.zzc(intent));
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbrzVar.zza(zzbbpVar.zzc(intent2));
        zzbrzVar.zzc(zzbbpVar.zzb());
        zzbrzVar.zzd(zzbbpVar.zza());
        zzbrzVar.zze(true);
        boolean zZzf = zzbrzVar.zzf();
        boolean zZzg = zzbrzVar.zzg();
        boolean zZzh = zzbrzVar.zzh();
        boolean zZzi = zzbrzVar.zzi();
        try {
            jSONObjectPut = new JSONObject().put("sms", zZzf).put("tel", zZzg).put("calendar", zZzh).put("storePicture", zZzi).put("inlineVideo", zzbrzVar.zzj());
        } catch (JSONException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Error occurred while obtaining the MRAID capabilities.", e7);
            jSONObjectPut = null;
        }
        zzcekVar.zzd("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        zzcekVar.getLocationOnScreen(iArr);
        Context context = this.zzi;
        zzb(C3244B.m17190a().m33292j(context, iArr[0]), C3244B.m17190a().m33292j(context, iArr[1]));
        if (AbstractC7599p.m33335j(2)) {
            AbstractC7599p.m33330e("Dispatching Ready Event.");
        }
        zzh(zzcekVar.zzs().f30226a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0060 A[PHI: r4
      0x0060: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:11:0x003f, B:17:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    public final void zzb(int i7, int i8) {
        int i9;
        Context context = this.zzi;
        int i10 = 0;
        if (context instanceof Activity) {
            C7351t.m32349g();
            i9 = C3431F0.m17432w((Activity) context)[0];
        } else {
            i9 = 0;
        }
        zzcek zzcekVar = this.zzh;
        if (zzcekVar.zzN() == null || !zzcekVar.zzN().zzg()) {
            int width = zzcekVar.getWidth();
            int height = zzcekVar.getHeight();
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzaj)).booleanValue()) {
                if (width == 0) {
                    width = zzcekVar.zzN() != null ? zzcekVar.zzN().zzb : 0;
                }
                if (height != 0) {
                    i10 = height;
                } else if (zzcekVar.zzN() != null) {
                    i10 = zzcekVar.zzN().zza;
                }
            } else {
                i10 = height;
            }
            this.zzf = C3244B.m17190a().m33292j(context, width);
            this.zzg = C3244B.m17190a().m33292j(context, i10);
        }
        zzj(i7, i8 - i9, this.zzf, this.zzg);
        zzcekVar.zzP().zzN(i7, i8);
    }
}
