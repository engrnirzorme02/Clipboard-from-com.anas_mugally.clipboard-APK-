package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzhpg extends zzhpe implements zzaqs {
    private int zzg;

    protected zzhpg(String str) {
        super("mvhd");
    }

    public final int zzg() {
        if (!this.zzb) {
            zzf();
        }
        return this.zzg;
    }

    protected final long zzh(ByteBuffer byteBuffer) {
        this.zzg = zzaqr.zzc(byteBuffer.get());
        zzaqr.zzb(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
