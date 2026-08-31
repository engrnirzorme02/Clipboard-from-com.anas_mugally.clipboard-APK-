package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.internal.ads.zzhib;
import com.google.android.gms.internal.ads.zzhih;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzhih<MessageType extends zzhih<MessageType, BuilderType>, BuilderType extends zzhib<MessageType, BuilderType>> extends zzhgk<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, zzhih<?, ?>> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc = -1;
    protected zzhkw zzt = zzhkw.zza();

    static Method zzbA(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e7) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(name.length() + 43 + String.valueOf(str).length() + 2);
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"");
            sb.append(str);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e7);
        }
    }

    static Object zzbB(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static zzhip zzbC() {
        return zzhii.zzd();
    }

    protected static zzhip zzbD(zzhip zzhipVar) {
        int size = zzhipVar.size();
        return zzhipVar.zzh(size + size);
    }

    protected static zzhis zzbE() {
        return zzhjg.zzg();
    }

    protected static zzhis zzbF(zzhis zzhisVar) {
        int size = zzhisVar.size();
        return zzhisVar.zzh(size + size);
    }

    protected static zzhio zzbG() {
        return zzhhy.zzd();
    }

    protected static zzhio zzbH(zzhio zzhioVar) {
        int size = zzhioVar.size();
        return zzhioVar.zzh(size + size);
    }

    protected static zzhik zzbI() {
        return zzhho.zzd();
    }

    protected static zzhik zzbJ(zzhik zzhikVar) {
        int size = zzhikVar.size();
        return zzhikVar.zzh(size + size);
    }

    protected static zzhij zzbK() {
        return zzhgr.zzd();
    }

    protected static zzhij zzbL(zzhij zzhijVar) {
        int size = zzhijVar.size();
        return zzhijVar.zzh(size + size);
    }

    protected static <E> zzhit<E> zzbM() {
        return zzhkd.zzd();
    }

    protected static <E> zzhit<E> zzbN(zzhit<E> zzhitVar) {
        int size = zzhitVar.size();
        return zzhitVar.zzh(size + size);
    }

    static <T extends zzhih<T, ?>> T zzbO(T t7, zzhhg zzhhgVar, zzhhr zzhhrVar) throws zzhiw {
        T t8 = (T) t7.zzbg();
        try {
            zzhkk zzhkkVarZzb = zzhkc.zza().zzb(t8.getClass());
            zzhkkVarZzb.zzg(t8, zzhhh.zza(zzhhgVar), zzhhrVar);
            zzhkkVarZzb.zzk(t8);
            return t8;
        } catch (zzhiw e7) {
            if (e7.zzb()) {
                throw new zzhiw(e7);
            }
            throw e7;
        } catch (zzhku e8) {
            throw e8.zza();
        } catch (IOException e9) {
            if (e9.getCause() instanceof zzhiw) {
                throw ((zzhiw) e9.getCause());
            }
            throw new zzhiw(e9);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof zzhiw) {
                throw ((zzhiw) e10.getCause());
            }
            throw e10;
        }
    }

    protected static <T extends zzhih<T, ?>> T zzbP(T t7, zzhhg zzhhgVar) {
        int i7 = zzhhr.zzb;
        int i8 = zzhgo.zza;
        return (T) zzbO(t7, zzhhgVar, zzhhr.zza);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    protected static <T extends zzhih<T, ?>> T zzbQ(T t7, ByteBuffer byteBuffer, zzhhr zzhhrVar) throws zzhiw {
        zzhhg zzhhgVarZzG;
        int i7 = zzhhg.zzf;
        boolean z7 = false;
        if (byteBuffer.hasArray()) {
            zzhhgVarZzG = zzhhg.zzG(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect()) {
            int i8 = zzhhf.zza;
            if (zzhlc.zzb()) {
                zzhhgVarZzG = new zzhhf(byteBuffer, z7, null);
            } else {
                int iRemaining = byteBuffer.remaining();
                byte[] bArr = new byte[iRemaining];
                byteBuffer.duplicate().get(bArr);
                zzhhgVarZzG = zzhhg.zzG(bArr, 0, iRemaining, true);
            }
        } else {
            int iRemaining2 = byteBuffer.remaining();
            byte[] bArr2 = new byte[iRemaining2];
            byteBuffer.duplicate().get(bArr2);
            zzhhgVarZzG = zzhhg.zzG(bArr2, 0, iRemaining2, true);
        }
        T t8 = (T) zzbZ(t7, zzhhgVarZzG, zzhhrVar);
        zzi(t8);
        return t8;
    }

    protected static <T extends zzhih<T, ?>> T zzbR(T t7, ByteBuffer byteBuffer) {
        int i7 = zzhhr.zzb;
        int i8 = zzhgo.zza;
        return (T) zzbQ(t7, byteBuffer, zzhhr.zza);
    }

    protected static <T extends zzhih<T, ?>> T zzbS(T t7, zzhhb zzhhbVar) throws zzhiw {
        int i7 = zzhhr.zzb;
        int i8 = zzhgo.zza;
        T t8 = (T) zzbT(t7, zzhhbVar, zzhhr.zza);
        zzi(t8);
        return t8;
    }

    protected static <T extends zzhih<T, ?>> T zzbT(T t7, zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        T t8 = (T) zzj(t7, zzhhbVar, zzhhrVar);
        zzi(t8);
        return t8;
    }

    protected static <T extends zzhih<T, ?>> T zzbU(T t7, byte[] bArr) throws zzhiw {
        int length = bArr.length;
        int i7 = zzhhr.zzb;
        int i8 = zzhgo.zza;
        T t8 = (T) zzh(t7, bArr, 0, length, zzhhr.zza);
        zzi(t8);
        return t8;
    }

    protected static <T extends zzhih<T, ?>> T zzbV(T t7, byte[] bArr, zzhhr zzhhrVar) throws zzhiw {
        T t8 = (T) zzh(t7, bArr, 0, bArr.length, zzhhrVar);
        zzi(t8);
        return t8;
    }

    protected static <T extends zzhih<T, ?>> T zzbW(T t7, InputStream inputStream) throws zzhiw {
        zzhhg zzhhgVarZzF = zzhhg.zzF(inputStream, 4096);
        int i7 = zzhhr.zzb;
        int i8 = zzhgo.zza;
        T t8 = (T) zzbO(t7, zzhhgVarZzF, zzhhr.zza);
        zzi(t8);
        return t8;
    }

    protected static <T extends zzhih<T, ?>> T zzbX(T t7, InputStream inputStream, zzhhr zzhhrVar) throws zzhiw {
        T t8 = (T) zzbO(t7, zzhhg.zzF(inputStream, 4096), zzhhrVar);
        zzi(t8);
        return t8;
    }

    protected static <T extends zzhih<T, ?>> T zzbY(T t7, zzhhg zzhhgVar) {
        int i7 = zzhhr.zzb;
        int i8 = zzhgo.zza;
        return (T) zzbZ(t7, zzhhgVar, zzhhr.zza);
    }

    protected static <T extends zzhih<T, ?>> T zzbZ(T t7, zzhhg zzhhgVar, zzhhr zzhhrVar) throws zzhiw {
        T t8 = (T) zzbO(t7, zzhhgVar, zzhhrVar);
        zzi(t8);
        return t8;
    }

    static <T extends zzhih> T zzbt(Class<T> cls) {
        zzhih<?, ?> zzhihVar = zzd.get(cls);
        if (zzhihVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzhihVar = zzd.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (zzhihVar != null) {
            return zzhihVar;
        }
        zzhih<?, ?> zzhihVarZzbw = ((zzhih) zzhlc.zzc(cls)).zzbw();
        if (zzhihVarZzbw == null) {
            throw new IllegalStateException();
        }
        zzd.put(cls, zzhihVarZzbw);
        return zzhihVarZzbw;
    }

    protected static <T extends zzhih> void zzbu(Class<T> cls, T t7) {
        t7.zzaY();
        zzd.put(cls, t7);
    }

    protected static Object zzbv(zzhjs zzhjsVar, String str, Object[] objArr) {
        return new zzhke(zzhjsVar, str, objArr);
    }

    public static <ContainingType extends zzhjs, Type> zzhif<ContainingType, Type> zzby(ContainingType containingtype, Type type, zzhjs zzhjsVar, zzhim zzhimVar, int i7, zzhli zzhliVar, Class cls) {
        return new zzhif<>(containingtype, type, zzhjsVar, new zzhie(zzhimVar, i7, zzhliVar, false, false), cls);
    }

    public static <ContainingType extends zzhjs, Type> zzhif<ContainingType, Type> zzbz(ContainingType containingtype, zzhjs zzhjsVar, zzhim zzhimVar, int i7, zzhli zzhliVar, boolean z7, Class cls) {
        return new zzhif<>(containingtype, zzhkd.zzd(), zzhjsVar, new zzhie(zzhimVar, i7, zzhliVar, true, z7), cls);
    }

    private void zzc() {
        if (this.zzt == zzhkw.zza()) {
            this.zzt = zzhkw.zzb();
        }
    }

    protected static <T extends zzhih<T, ?>> T zzca(T t7, InputStream inputStream) throws zzhiw {
        int i7 = zzhhr.zzb;
        int i8 = zzhgo.zza;
        T t8 = (T) zzk(t7, inputStream, zzhhr.zza);
        zzi(t8);
        return t8;
    }

    protected static <T extends zzhih<T, ?>> T zzcb(T t7, InputStream inputStream, zzhhr zzhhrVar) throws zzhiw {
        T t8 = (T) zzk(t7, inputStream, zzhhrVar);
        zzi(t8);
        return t8;
    }

    private int zzd(zzhkk<?> zzhkkVar) {
        if (zzhkkVar != null) {
            return zzhkkVar.zze(this);
        }
        return zzhkc.zza().zzb(getClass()).zze(this);
    }

    private static <MessageType extends zzhid<MessageType, BuilderType>, BuilderType, T> zzhif<MessageType, T> zze(zzhhp<MessageType, T> zzhhpVar) {
        return (zzhif) zzhhpVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends zzhih<T, ?>> boolean zzg(T t7, boolean z7) {
        byte bByteValue = ((Byte) t7.zzdh(zzhig.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzhkc.zza().zzb(t7.getClass()).zzl(t7);
        if (z7) {
            t7.zzdh(zzhig.SET_MEMOIZED_IS_INITIALIZED, true != zZzl ? null : t7, null);
        }
        return zZzl;
    }

    private static <T extends zzhih<T, ?>> T zzh(T t7, byte[] bArr, int i7, int i8, zzhhr zzhhrVar) throws zzhiw {
        if (i8 == 0) {
            return t7;
        }
        T t8 = (T) t7.zzbg();
        try {
            zzhkk zzhkkVarZzb = zzhkc.zza().zzb(t8.getClass());
            zzhkkVarZzb.zzj(t8, bArr, i7, i7 + i8, new zzhgp(zzhhrVar));
            zzhkkVarZzb.zzk(t8);
            return t8;
        } catch (zzhiw e7) {
            if (e7.zzb()) {
                throw new zzhiw(e7);
            }
            throw e7;
        } catch (zzhku e8) {
            throw e8.zza();
        } catch (IOException e9) {
            if (e9.getCause() instanceof zzhiw) {
                throw ((zzhiw) e9.getCause());
            }
            throw new zzhiw(e9);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static <T extends zzhih<T, ?>> T zzi(T t7) throws zzhiw {
        if (t7 == null || t7.zzbi()) {
            return t7;
        }
        throw t7.zzaU().zza();
    }

    private static <T extends zzhih<T, ?>> T zzj(T t7, zzhhb zzhhbVar, zzhhr zzhhrVar) {
        zzhhg zzhhgVarZzp = zzhhbVar.zzp();
        T t8 = (T) zzbO(t7, zzhhgVarZzp, zzhhrVar);
        zzhhgVarZzp.zzb(0);
        return t8;
    }

    private static <T extends zzhih<T, ?>> T zzk(T t7, InputStream inputStream, zzhhr zzhhrVar) throws zzhiw {
        try {
            int i7 = inputStream.read();
            if (i7 == -1) {
                return null;
            }
            zzhhg zzhhgVarZzF = zzhhg.zzF(new zzhgi(inputStream, zzhhg.zzM(i7, inputStream)), 4096);
            T t8 = (T) zzbO(t7, zzhhgVarZzF, zzhhrVar);
            zzhhgVarZzF.zzb(0);
            return t8;
        } catch (zzhiw e7) {
            if (e7.zzb()) {
                throw new zzhiw(e7);
            }
            throw e7;
        } catch (IOException e8) {
            throw new zzhiw(e8);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzhkc.zza().zzb(getClass()).zzb(this, (zzhih) obj);
    }

    public int hashCode() {
        if (zzaX()) {
            return zzbh();
        }
        if (zzbc()) {
            zzba(zzbh());
        }
        return zzaZ();
    }

    public String toString() {
        return zzhju.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhgk
    int zzaQ() {
        return this.zzc & C3553a.e.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk
    void zzaR(int i7) {
        if (i7 >= 0) {
            this.zzc = i7 | (this.zzc & zza);
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 42);
        sb.append("serialized size must be non-negative, was ");
        sb.append(i7);
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhgk
    int zzaT(zzhkk zzhkkVar) {
        if (!zzaX()) {
            if (zzaQ() != Integer.MAX_VALUE) {
                return zzaQ();
            }
            int iZzd = zzd(zzhkkVar);
            zzaR(iZzd);
            return iZzd;
        }
        int iZzd2 = zzd(zzhkkVar);
        if (iZzd2 >= 0) {
            return iZzd2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iZzd2).length() + 42);
        sb.append("serialized size must be non-negative, was ");
        sb.append(iZzd2);
        throw new IllegalStateException(sb.toString());
    }

    boolean zzaX() {
        return (this.zzc & zza) != 0;
    }

    void zzaY() {
        this.zzc &= C3553a.e.API_PRIORITY_OTHER;
    }

    int zzaZ() {
        return this.zzq;
    }

    void zzba(int i7) {
        this.zzq = i7;
    }

    void zzbb() {
        this.zzq = 0;
    }

    boolean zzbc() {
        return zzaZ() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhjs
    public final zzhka<MessageType> zzbd() {
        return (zzhka) zzdh(zzhig.GET_PARSER, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhjt
    /* JADX INFO: renamed from: zzbe, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbw() {
        return (MessageType) zzdh(zzhig.GET_DEFAULT_INSTANCE, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhjs
    /* JADX INFO: renamed from: zzbf, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzdd() {
        return (BuilderType) zzdh(zzhig.NEW_BUILDER, null, null);
    }

    MessageType zzbg() {
        return (MessageType) zzdh(zzhig.NEW_MUTABLE_INSTANCE, null, null);
    }

    int zzbh() {
        return zzhkc.zza().zzb(getClass()).zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhjt
    public final boolean zzbi() {
        return zzg(this, true);
    }

    protected boolean zzbj(int i7, zzhhg zzhhgVar) {
        if ((i7 & 7) == 4) {
            return false;
        }
        zzc();
        return this.zzt.zzl(i7, zzhhgVar);
    }

    protected void zzbk(int i7, int i8) {
        zzc();
        zzhkw zzhkwVar = this.zzt;
        zzhkwVar.zze();
        if (i7 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzhkwVar.zzk(i7 << 3, Long.valueOf(i8));
    }

    protected void zzbl(int i7, zzhhb zzhhbVar) {
        zzc();
        zzhkw zzhkwVar = this.zzt;
        zzhkwVar.zze();
        if (i7 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzhkwVar.zzk((i7 << 3) | 2, zzhhbVar);
    }

    protected void zzbm() {
        zzhkc.zza().zzb(getClass()).zzk(this);
        zzaY();
    }

    protected final <MessageType2 extends zzhih<MessageType2, BuilderType2>, BuilderType2 extends zzhib<MessageType2, BuilderType2>> BuilderType2 zzbn() {
        return (BuilderType2) zzdh(zzhig.NEW_BUILDER, null, null);
    }

    protected final <MessageType2 extends zzhih<MessageType2, BuilderType2>, BuilderType2 extends zzhib<MessageType2, BuilderType2>> BuilderType2 zzbo(MessageType2 messagetype2) {
        BuilderType2 buildertype2 = (BuilderType2) zzbn();
        buildertype2.zzbo(messagetype2);
        return buildertype2;
    }

    /* JADX INFO: renamed from: zzbp, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcc() {
        BuilderType buildertype = (BuilderType) zzdh(zzhig.NEW_BUILDER, null, null);
        buildertype.zzbo(this);
        return buildertype;
    }

    void zzbq() {
        zzaR(C3553a.e.API_PRIORITY_OTHER);
    }

    @Override // com.google.android.gms.internal.ads.zzhjs
    public int zzbr() {
        return zzaT(null);
    }

    Object zzbs() {
        return zzdh(zzhig.BUILD_MESSAGE_INFO, null, null);
    }

    protected final void zzbx(zzhkw zzhkwVar) {
        this.zzt = zzhkw.zzc(this.zzt, zzhkwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhjs
    public void zzdc(zzhhm zzhhmVar) {
        zzhkc.zza().zzb(getClass()).zzf(this, zzhhn.zza(zzhhmVar));
    }

    protected abstract Object zzdh(zzhig zzhigVar, Object obj, Object obj2);
}
