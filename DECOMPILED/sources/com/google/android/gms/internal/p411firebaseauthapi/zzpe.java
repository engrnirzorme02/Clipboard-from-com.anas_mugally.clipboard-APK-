package com.google.android.gms.internal.p411firebaseauthapi;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpe {
    public static final zzaaj zza = zzaaj.zza(new byte[0]);

    public static final zzaaj zza(int i7) {
        return zzaaj.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(i7).array());
    }

    public static final zzaaj zzb(int i7) {
        return zzaaj.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(i7).array());
    }
}
