package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p227d3.C5228d;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdvc {
    private final Context zza;
    private final ApplicationInfo zzb;
    private String zze = "";
    private final int zzc = ((Integer) C3250D.m17200c().zzd(zzbci.zzjV)).intValue();
    private final int zzd = ((Integer) C3250D.m17200c().zzd(zzbci.zzjW)).intValue();

    public zzdvc(Context context) {
        this.zza = context;
        this.zzb = context.getApplicationInfo();
    }

    public final JSONObject zza() throws JSONException {
        String strM17407d0;
        String strEncodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            Context context = this.zza;
            String str = this.zzb.packageName;
            zzfro zzfroVar = C3431F0.f14180l;
            jSONObject.put("name", C5228d.m24155a(context).m24150d(str));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.zzb.packageName);
        C7351t.m32349g();
        Drawable drawable = null;
        try {
            strM17407d0 = C3431F0.m17407d0(this.zza);
        } catch (RemoteException unused2) {
            strM17407d0 = null;
        }
        jSONObject.put("adMobAppId", strM17407d0);
        if (this.zze.isEmpty()) {
            try {
                drawable = (Drawable) C5228d.m24155a(this.zza).m24151e(this.zzb.packageName).f3547b;
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (drawable == null) {
                strEncodeToString = "";
            } else {
                int i7 = this.zzc;
                int i8 = this.zzd;
                drawable.setBounds(0, 0, i7, i8);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.zze = strEncodeToString;
        }
        if (!this.zze.isEmpty()) {
            jSONObject.put("icon", this.zze);
            jSONObject.put("iconWidthPx", this.zzc);
            jSONObject.put("iconHeightPx", this.zzd);
        }
        return jSONObject;
    }
}
