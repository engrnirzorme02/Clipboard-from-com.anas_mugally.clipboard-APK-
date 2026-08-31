package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.util.Map;
import p364u2.AbstractC7158d;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbry extends zzbsb {
    private final Map zza;
    private final Context zzb;

    public zzbry(zzcek zzcekVar, Map map) {
        super(zzcekVar, "storePicture");
        this.zza = map;
        this.zzb = zzcekVar.zzj();
    }

    public final void zza() {
        Context context = this.zzb;
        if (context == null) {
            zzg("Activity context is not available");
            return;
        }
        C7351t.m32349g();
        if (!new zzbbp(context).zza()) {
            zzg("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzg("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            zzg("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        C7351t.m32349g();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            zzg("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources resourcesZzf = C7351t.m32354l().zzf();
        C7351t.m32349g();
        AlertDialog.Builder builderM17424o = C3431F0.m17424o(context);
        builderM17424o.setTitle(resourcesZzf != null ? resourcesZzf.getString(AbstractC7158d.f28599n) : "Save image");
        builderM17424o.setMessage(resourcesZzf != null ? resourcesZzf.getString(AbstractC7158d.f28600o) : "Allow Ad to store image in Picture gallery?");
        builderM17424o.setPositiveButton(resourcesZzf != null ? resourcesZzf.getString(AbstractC7158d.f28601p) : "Accept", new zzbrw(this, str, lastPathSegment));
        builderM17424o.setNegativeButton(resourcesZzf != null ? resourcesZzf.getString(AbstractC7158d.f28602q) : "Decline", new zzbrx(this));
        builderM17424o.create().show();
    }

    final /* synthetic */ Context zzb() {
        return this.zzb;
    }
}
