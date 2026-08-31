package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.internal.p411firebaseauthapi.zzajm;
import com.google.android.gms.internal.p411firebaseauthapi.zzajo;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzajm<MessageType extends zzajm<MessageType, BuilderType>, BuilderType extends zzajo<MessageType, BuilderType>> implements zzamm {
    protected int zza = 0;

    int zza(zzanb zzanbVar) {
        int iZzi = zzi();
        if (iZzi != -1) {
            return iZzi;
        }
        int iZza = zzanbVar.zza(this);
        zzb(iZza);
        return iZza;
    }

    void zzb(int i7) {
        throw new UnsupportedOperationException();
    }

    int zzi() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzamm
    public final zzajv zzj() {
        try {
            zzake zzakeVarZzc = zzajv.zzc(zzl());
            zza(zzakeVarZzc.zzb());
            return zzakeVarZzc.zza();
        } catch (IOException e7) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e7);
        }
    }

    public final byte[] zzk() {
        try {
            byte[] bArr = new byte[zzl()];
            zzakn zzaknVarZzb = zzakn.zzb(bArr);
            zza(zzaknVarZzb);
            zzaknVarZzb.zzb();
            return bArr;
        } catch (IOException e7) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e7);
        }
    }

    public final void zza(OutputStream outputStream) {
        zzakn zzaknVarZza = zzakn.zza(outputStream, zzakn.zze(zzl()));
        zza(zzaknVarZza);
        zzaknVarZza.zzc();
    }
}
