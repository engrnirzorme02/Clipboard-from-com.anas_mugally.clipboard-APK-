package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhgj;
import com.google.android.gms.internal.ads.zzhgk;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzhgk<MessageType extends zzhgk<MessageType, BuilderType>, BuilderType extends zzhgj<MessageType, BuilderType>> implements zzhjs {
    protected int zzq = 0;

    protected static void zzaV(zzhhb zzhhbVar) {
        if (!zzhhbVar.zzm()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    protected static <T> void zzaW(Iterable<T> iterable, List<? super T> list) {
        zzhgj.zzaT(iterable, list);
    }

    private String zzdZ(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 18 + String.valueOf(str).length() + 44);
        sb.append("Serializing ");
        sb.append(name);
        sb.append(" to a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhjs
    public zzhhb zzaM() {
        try {
            int iZzbr = zzbr();
            zzhhb zzhhbVar = zzhhb.zzb;
            byte[] bArr = new byte[iZzbr];
            int i7 = zzhhm.zzf;
            zzhhj zzhhjVar = new zzhhj(bArr, 0, iZzbr);
            zzdc(zzhhjVar);
            return zzhgx.zza(zzhhjVar, bArr);
        } catch (IOException e7) {
            throw new RuntimeException(zzdZ("ByteString"), e7);
        }
    }

    public byte[] zzaN() {
        try {
            int iZzbr = zzbr();
            byte[] bArr = new byte[iZzbr];
            int i7 = zzhhm.zzf;
            zzhhj zzhhjVar = new zzhhj(bArr, 0, iZzbr);
            zzdc(zzhhjVar);
            zzhhjVar.zzE();
            return bArr;
        } catch (IOException e7) {
            throw new RuntimeException(zzdZ("byte array"), e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhjs
    public void zzaO(OutputStream outputStream) {
        zzhhl zzhhlVar = new zzhhl(outputStream, zzhhm.zzz(zzbr()));
        zzdc(zzhhlVar);
        zzhhlVar.zzy();
    }

    public void zzaP(OutputStream outputStream) {
        int iZzbr = zzbr();
        zzhhl zzhhlVar = new zzhhl(outputStream, zzhhm.zzz(zzhhm.zzA(iZzbr) + iZzbr));
        zzhhlVar.zzs(iZzbr);
        zzdc(zzhhlVar);
        zzhhlVar.zzy();
    }

    int zzaQ() {
        throw new UnsupportedOperationException();
    }

    void zzaR(int i7) {
        throw new UnsupportedOperationException();
    }

    public zzhjx zzaS() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    int zzaT(zzhkk zzhkkVar) {
        return zzaQ();
    }

    zzhku zzaU() {
        return new zzhku(this);
    }
}
