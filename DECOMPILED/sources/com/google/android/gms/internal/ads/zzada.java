package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface zzada {
    zzacu[] zza();

    default zzacu[] zzb(Uri uri, Map map) {
        return zza();
    }
}
