package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaqw extends zzhpe {
    public zzaqw(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzhpe
    public final void zze(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
