package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhib;
import com.google.android.gms.internal.ads.zzhih;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class zzhib<MessageType extends zzhih<MessageType, BuilderType>, BuilderType extends zzhib<MessageType, BuilderType>> extends zzhgj<MessageType, BuilderType> {
    protected MessageType zza;
    private final MessageType zzb;

    protected zzhib(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzaX()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = (MessageType) zza();
    }

    private MessageType zza() {
        return (MessageType) this.zzb.zzbg();
    }

    private static <MessageType> void zzb(MessageType messagetype, MessageType messagetype2) {
        zzhkc.zza().zzb(messagetype.getClass()).zzd(messagetype, messagetype2);
    }

    @Override // com.google.android.gms.internal.ads.zzhgj
    /* JADX INFO: renamed from: zzaE */
    public /* bridge */ /* synthetic */ zzhgj zzbd(zzhhg zzhhgVar, zzhhr zzhhrVar) throws IOException {
        zzbr(zzhhgVar, zzhhrVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhgj
    /* JADX INFO: renamed from: zzaI */
    public /* bridge */ /* synthetic */ zzhgj zzaZ(byte[] bArr, int i7, int i8) throws zzhiw {
        zzbq(bArr, i7, i8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhgj
    /* JADX INFO: renamed from: zzaK */
    public /* bridge */ /* synthetic */ zzhgj zzaX(byte[] bArr, int i7, int i8, zzhhr zzhhrVar) throws zzhiw {
        zzbp(bArr, i7, i8, zzhhrVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhgj
    protected /* bridge */ /* synthetic */ zzhgj zzaQ(zzhgk zzhgkVar) {
        zzbn((zzhih) zzhgkVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhgj
    public /* bridge */ /* synthetic */ zzhjr zzaX(byte[] bArr, int i7, int i8, zzhhr zzhhrVar) throws zzhiw {
        zzbp(bArr, i7, i8, zzhhrVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhgj
    public /* bridge */ /* synthetic */ zzhjr zzaZ(byte[] bArr, int i7, int i8) throws zzhiw {
        zzbq(bArr, i7, i8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhgj
    public /* bridge */ /* synthetic */ zzhjr zzbd(zzhhg zzhhgVar, zzhhr zzhhrVar) throws IOException {
        zzbr(zzhhgVar, zzhhrVar);
        return this;
    }

    protected final void zzbg() {
        if (this.zza.zzaX()) {
            return;
        }
        zzbh();
    }

    protected void zzbh() {
        MessageType messagetype = (MessageType) zza();
        zzb(messagetype, this.zza);
        this.zza = messagetype;
    }

    @Override // com.google.android.gms.internal.ads.zzhjt
    public final boolean zzbi() {
        return zzhih.zzg(this.zza, false);
    }

    public final BuilderType zzbj() {
        if (this.zzb.zzaX()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = (MessageType) zza();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhgj
    /* JADX INFO: renamed from: zzbk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuilderType zzbf() {
        BuilderType buildertype = (BuilderType) zzbw().zzdd();
        buildertype.zza = (MessageType) zzbt();
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzhjr
    /* JADX INFO: renamed from: zzbl, reason: merged with bridge method [inline-methods] */
    public MessageType zzbt() {
        if (!this.zza.zzaX()) {
            return this.zza;
        }
        this.zza.zzbm();
        return this.zza;
    }

    /* JADX INFO: renamed from: zzbm, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbu() {
        MessageType messagetype = (MessageType) zzbt();
        if (messagetype.zzbi()) {
            return messagetype;
        }
        throw zzhgj.zzaR(messagetype);
    }

    protected BuilderType zzbn(MessageType messagetype) {
        zzbo(messagetype);
        return this;
    }

    public BuilderType zzbo(MessageType messagetype) {
        if (zzbw().equals(messagetype)) {
            return this;
        }
        zzbg();
        zzb(this.zza, messagetype);
        return this;
    }

    public BuilderType zzbp(byte[] bArr, int i7, int i8, zzhhr zzhhrVar) throws zzhiw {
        zzbg();
        try {
            zzhkc.zza().zzb(this.zza.getClass()).zzj(this.zza, bArr, i7, i7 + i8, new zzhgp(zzhhrVar));
            return this;
        } catch (zzhiw e7) {
            throw e7;
        } catch (IOException e8) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e8);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public BuilderType zzbq(byte[] bArr, int i7, int i8) throws zzhiw {
        int i9 = zzhhr.zzb;
        int i10 = zzhgo.zza;
        zzbp(bArr, i7, i8, zzhhr.zza);
        return this;
    }

    public BuilderType zzbr(zzhhg zzhhgVar, zzhhr zzhhrVar) throws IOException {
        zzbg();
        try {
            zzhkc.zza().zzb(this.zza.getClass()).zzg(this.zza, zzhhh.zza(zzhhgVar), zzhhrVar);
            return this;
        } catch (RuntimeException e7) {
            if (e7.getCause() instanceof IOException) {
                throw ((IOException) e7.getCause());
            }
            throw e7;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhjt
    /* JADX INFO: renamed from: zzbs, reason: merged with bridge method [inline-methods] */
    public MessageType zzbw() {
        return this.zzb;
    }

    public /* bridge */ /* synthetic */ zzhjr zzbv() {
        zzbj();
        return this;
    }
}
