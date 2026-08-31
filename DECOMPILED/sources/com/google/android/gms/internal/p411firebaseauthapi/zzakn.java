package com.google.android.gms.internal.p411firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzakn extends zzajw {
    private static final Logger zzb = Logger.getLogger(zzakn.class.getName());
    private static final boolean zzc = zzanz.zzc();
    zzakp zza;

    private static class zza extends zzakn {
        private final byte[] zzb;
        private final int zzc;
        private int zzd;

        zza(byte[] bArr, int i7, int i8) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i8) | i8) < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i8)));
            }
            this.zzb = bArr;
            this.zzd = 0;
            this.zzc = i8;
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final int zza() {
            return this.zzc - this.zzd;
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzb(int i7, boolean z7) {
            zzj(i7, 0);
            zza(z7 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzc() {
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzd(int i7, zzajv zzajvVar) {
            zzj(1, 3);
            zzk(2, i7);
            zzc(3, zzajvVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzf(int i7, long j7) {
            zzj(i7, 1);
            zzf(j7);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzg(int i7, int i8) {
            zzj(i7, 5);
            zzj(i8);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzh(int i7, int i8) {
            zzj(i7, 0);
            zzk(i8);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzj(int i7) throws zzd {
            int i8 = this.zzd;
            try {
                byte[] bArr = this.zzb;
                bArr[i8] = (byte) i7;
                bArr[i8 + 1] = (byte) (i7 >> 8);
                bArr[i8 + 2] = (byte) (i7 >> 16);
                bArr[i8 + 3] = i7 >> 24;
                this.zzd = i8 + 4;
            } catch (IndexOutOfBoundsException e7) {
                throw new zzd(i8, this.zzc, 4, (Throwable) e7);
            }
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzk(int i7) {
            if (i7 >= 0) {
                zzm(i7);
            } else {
                zzh(i7);
            }
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzm(int i7) throws zzd {
            int i8;
            int i9 = this.zzd;
            while ((i7 & (-128)) != 0) {
                try {
                    i8 = i9 + 1;
                    try {
                        this.zzb[i9] = (byte) (i7 | 128);
                        i7 >>>= 7;
                        i9 = i8;
                    } catch (IndexOutOfBoundsException e7) {
                        e = e7;
                        i9 = i8;
                        throw new zzd(i9, this.zzc, 1, (Throwable) e);
                    }
                } catch (IndexOutOfBoundsException e8) {
                    e = e8;
                    throw new zzd(i9, this.zzc, 1, (Throwable) e);
                }
            }
            i8 = i9 + 1;
            this.zzb[i9] = (byte) i7;
            this.zzd = i8;
        }

        private final void zzc(byte[] bArr, int i7, int i8) throws zzd {
            try {
                System.arraycopy(bArr, i7, this.zzb, this.zzd, i8);
                this.zzd += i8;
            } catch (IndexOutOfBoundsException e7) {
                throw new zzd(this.zzd, this.zzc, i8, (Throwable) e7);
            }
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zza(byte b7) throws zzd {
            int i7 = this.zzd;
            try {
                int i8 = i7 + 1;
                try {
                    this.zzb[i7] = b7;
                    this.zzd = i8;
                } catch (IndexOutOfBoundsException e7) {
                    e = e7;
                    i7 = i8;
                    throw new zzd(i7, this.zzc, 1, (Throwable) e);
                }
            } catch (IndexOutOfBoundsException e8) {
                e = e8;
            }
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzb(byte[] bArr, int i7, int i8) throws zzd {
            zzm(i8);
            zzc(bArr, 0, i8);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzf(long j7) throws zzd {
            int i7 = this.zzd;
            try {
                byte[] bArr = this.zzb;
                bArr[i7] = (byte) j7;
                bArr[i7 + 1] = (byte) (j7 >> 8);
                bArr[i7 + 2] = (byte) (j7 >> 16);
                bArr[i7 + 3] = (byte) (j7 >> 24);
                bArr[i7 + 4] = (byte) (j7 >> 32);
                bArr[i7 + 5] = (byte) (j7 >> 40);
                bArr[i7 + 6] = (byte) (j7 >> 48);
                bArr[i7 + 7] = (byte) (j7 >> 56);
                this.zzd = i7 + 8;
            } catch (IndexOutOfBoundsException e7) {
                throw new zzd(i7, this.zzc, 8, (Throwable) e7);
            }
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzh(int i7, long j7) {
            zzj(i7, 0);
            zzh(j7);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzk(int i7, int i8) {
            zzj(i7, 0);
            zzm(i8);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzb(zzajv zzajvVar) {
            zzm(zzajvVar.zzb());
            zzajvVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzc(int i7, zzajv zzajvVar) {
            zzj(i7, 2);
            zzb(zzajvVar);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzh(long j7) throws zzd {
            int i7;
            int i8 = this.zzd;
            if (zzakn.zzc && zza() >= 10) {
                while ((j7 & (-128)) != 0) {
                    zzanz.zza(this.zzb, i8, (byte) (((int) j7) | 128));
                    j7 >>>= 7;
                    i8++;
                }
                i7 = i8 + 1;
                zzanz.zza(this.zzb, i8, (byte) j7);
            } else {
                while ((j7 & (-128)) != 0) {
                    try {
                        int i9 = i8 + 1;
                        try {
                            this.zzb[i8] = (byte) (((int) j7) | 128);
                            j7 >>>= 7;
                            i8 = i9;
                        } catch (IndexOutOfBoundsException e7) {
                            e = e7;
                            i8 = i9;
                            throw new zzd(i8, this.zzc, 1, (Throwable) e);
                        }
                    } catch (IndexOutOfBoundsException e8) {
                        e = e8;
                    }
                }
                i7 = i8 + 1;
                try {
                    this.zzb[i8] = (byte) j7;
                } catch (IndexOutOfBoundsException e9) {
                    e = e9;
                    i8 = i7;
                    throw new zzd(i8, this.zzc, 1, (Throwable) e);
                }
            }
            this.zzd = i7;
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajw
        public final void zza(byte[] bArr, int i7, int i8) throws zzd {
            zzc(bArr, i7, i8);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzb(zzamm zzammVar) {
            zzm(zzammVar.zzl());
            zzammVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzj(int i7, int i8) {
            zzm((i7 << 3) | i8);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzb(int i7, zzamm zzammVar) {
            zzj(1, 3);
            zzk(2, i7);
            zzj(3, 2);
            zzb(zzammVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzb(int i7, String str) {
            zzj(i7, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzb(String str) throws zzd {
            int i7 = this.zzd;
            try {
                int iZzi = zzakn.zzi(str.length() * 3);
                int iZzi2 = zzakn.zzi(str.length());
                if (iZzi2 == iZzi) {
                    int i8 = i7 + iZzi2;
                    this.zzd = i8;
                    int iZza = zzaoa.zza(str, this.zzb, i8, zza());
                    this.zzd = i7;
                    zzm((iZza - i7) - iZzi2);
                    this.zzd = iZza;
                    return;
                }
                zzm(zzaoa.zza(str));
                this.zzd = zzaoa.zza(str, this.zzb, this.zzd, zza());
            } catch (zzaod e7) {
                this.zzd = i7;
                zza(str, e7);
            } catch (IndexOutOfBoundsException e8) {
                throw new zzd(e8);
            }
        }
    }

    private static abstract class zzb extends zzakn {
        final byte[] zzb;
        final int zzc;
        int zzd;
        int zze;

        zzb(int i7) {
            super();
            if (i7 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i7, 20)];
            this.zzb = bArr;
            this.zzc = bArr.length;
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final int zza() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        final void zzb(byte b7) {
            int i7 = this.zzd;
            this.zzb[i7] = b7;
            this.zzd = i7 + 1;
            this.zze++;
        }

        final void zzi(long j7) {
            int i7 = this.zzd;
            byte[] bArr = this.zzb;
            bArr[i7] = (byte) j7;
            bArr[i7 + 1] = (byte) (j7 >> 8);
            bArr[i7 + 2] = (byte) (j7 >> 16);
            bArr[i7 + 3] = (byte) (j7 >> 24);
            bArr[i7 + 4] = (byte) (j7 >> 32);
            bArr[i7 + 5] = (byte) (j7 >> 40);
            bArr[i7 + 6] = (byte) (j7 >> 48);
            bArr[i7 + 7] = (byte) (j7 >> 56);
            this.zzd = i7 + 8;
            this.zze += 8;
        }

        final void zzj(long j7) {
            if (!zzakn.zzc) {
                while ((j7 & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i7 = this.zzd;
                    this.zzd = i7 + 1;
                    bArr[i7] = (byte) (((int) j7) | 128);
                    this.zze++;
                    j7 >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i8 = this.zzd;
                this.zzd = i8 + 1;
                bArr2[i8] = (byte) j7;
                this.zze++;
                return;
            }
            long j8 = this.zzd;
            while ((j7 & (-128)) != 0) {
                byte[] bArr3 = this.zzb;
                int i9 = this.zzd;
                this.zzd = i9 + 1;
                zzanz.zza(bArr3, i9, (byte) (((int) j7) | 128));
                j7 >>>= 7;
            }
            byte[] bArr4 = this.zzb;
            int i10 = this.zzd;
            this.zzd = i10 + 1;
            zzanz.zza(bArr4, i10, (byte) j7);
            this.zze += (int) (((long) this.zzd) - j8);
        }

        final void zzl(int i7, int i8) {
            zzo((i7 << 3) | i8);
        }

        final void zzn(int i7) {
            int i8 = this.zzd;
            byte[] bArr = this.zzb;
            bArr[i8] = (byte) i7;
            bArr[i8 + 1] = (byte) (i7 >> 8);
            bArr[i8 + 2] = (byte) (i7 >> 16);
            bArr[i8 + 3] = i7 >> 24;
            this.zzd = i8 + 4;
            this.zze += 4;
        }

        final void zzo(int i7) {
            if (!zzakn.zzc) {
                while ((i7 & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i8 = this.zzd;
                    this.zzd = i8 + 1;
                    bArr[i8] = (byte) (i7 | 128);
                    this.zze++;
                    i7 >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i9 = this.zzd;
                this.zzd = i9 + 1;
                bArr2[i9] = (byte) i7;
                this.zze++;
                return;
            }
            long j7 = this.zzd;
            while ((i7 & (-128)) != 0) {
                byte[] bArr3 = this.zzb;
                int i10 = this.zzd;
                this.zzd = i10 + 1;
                zzanz.zza(bArr3, i10, (byte) (i7 | 128));
                i7 >>>= 7;
            }
            byte[] bArr4 = this.zzb;
            int i11 = this.zzd;
            this.zzd = i11 + 1;
            zzanz.zza(bArr4, i11, (byte) i7);
            this.zze += (int) (((long) this.zzd) - j7);
        }
    }

    public static class zzd extends IOException {
        zzd() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzd(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        private zzd(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        zzd(int i7, int i8, int i9, Throwable th) {
            this(i7, i8, i9, th);
        }

        private zzd(long j7, long j8, int i7, Throwable th) {
            this(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j7), Long.valueOf(j8), Integer.valueOf(i7)), th);
        }
    }

    public static int zza(double d7) {
        return 8;
    }

    public static int zzb(int i7) {
        return 4;
    }

    public static int zzc(long j7) {
        return 8;
    }

    static int zze(int i7) {
        if (i7 > 4096) {
            return 4096;
        }
        return i7;
    }

    public static int zzf(int i7) {
        return 4;
    }

    public static int zzg(int i7) {
        return zzi(zzn(i7));
    }

    public static int zzh(int i7) {
        return zzi(i7 << 3);
    }

    private static long zzi(long j7) {
        return (j7 >> 63) ^ (j7 << 1);
    }

    private static int zzn(int i7) {
        return (i7 >> 31) ^ (i7 << 1);
    }

    public abstract int zza();

    public abstract void zza(byte b7);

    public abstract void zzb(int i7, zzamm zzammVar);

    public abstract void zzb(int i7, String str);

    public abstract void zzb(int i7, boolean z7);

    public abstract void zzb(zzajv zzajvVar);

    public abstract void zzb(zzamm zzammVar);

    public abstract void zzb(String str);

    abstract void zzb(byte[] bArr, int i7, int i8);

    public abstract void zzc();

    public abstract void zzc(int i7, zzajv zzajvVar);

    public abstract void zzd(int i7, zzajv zzajvVar);

    public abstract void zzf(int i7, long j7);

    public abstract void zzf(long j7);

    public abstract void zzg(int i7, int i8);

    public abstract void zzh(int i7, int i8);

    public abstract void zzh(int i7, long j7);

    public abstract void zzh(long j7);

    public abstract void zzj(int i7);

    public abstract void zzj(int i7, int i8);

    public abstract void zzk(int i7);

    public abstract void zzk(int i7, int i8);

    public final void zzl(int i7) {
        zzm(zzn(i7));
    }

    public abstract void zzm(int i7);

    private static final class zzc extends zzb {
        private final OutputStream zzf;

        zzc(OutputStream outputStream, int i7) {
            super(i7);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.zzf = outputStream;
        }

        private final void zze() throws IOException {
            this.zzf.write(this.zzb, 0, this.zzd);
            this.zzd = 0;
        }

        private final void zzp(int i7) throws IOException {
            if (this.zzc - this.zzd < i7) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zza(byte b7) throws IOException {
            if (this.zzd == this.zzc) {
                zze();
            }
            zzb(b7);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzb(int i7, boolean z7) throws IOException {
            zzp(11);
            zzl(i7, 0);
            zzb(z7 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzc() throws IOException {
            if (this.zzd > 0) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzd(int i7, zzajv zzajvVar) {
            zzj(1, 3);
            zzk(2, i7);
            zzc(3, zzajvVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzf(int i7, long j7) throws IOException {
            zzp(18);
            zzl(i7, 1);
            zzi(j7);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzg(int i7, int i8) throws IOException {
            zzp(14);
            zzl(i7, 5);
            zzn(i8);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzh(int i7, int i8) throws IOException {
            zzp(20);
            zzl(i7, 0);
            if (i8 >= 0) {
                zzo(i8);
            } else {
                zzj(i8);
            }
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzj(int i7) throws IOException {
            zzp(4);
            zzn(i7);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzk(int i7) {
            if (i7 >= 0) {
                zzm(i7);
            } else {
                zzh(i7);
            }
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzm(int i7) throws IOException {
            zzp(5);
            zzo(i7);
        }

        private final void zzc(byte[] bArr, int i7, int i8) throws IOException {
            int i9 = this.zzc;
            int i10 = this.zzd;
            if (i9 - i10 >= i8) {
                System.arraycopy(bArr, i7, this.zzb, i10, i8);
                this.zzd += i8;
            } else {
                int i11 = i9 - i10;
                System.arraycopy(bArr, i7, this.zzb, i10, i11);
                int i12 = i7 + i11;
                i8 -= i11;
                this.zzd = this.zzc;
                this.zze += i11;
                zze();
                if (i8 <= this.zzc) {
                    System.arraycopy(bArr, i12, this.zzb, 0, i8);
                    this.zzd = i8;
                } else {
                    this.zzf.write(bArr, i12, i8);
                }
            }
            this.zze += i8;
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzj(int i7, int i8) {
            zzm((i7 << 3) | i8);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzk(int i7, int i8) throws IOException {
            zzp(20);
            zzl(i7, 0);
            zzo(i8);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajw
        public final void zza(byte[] bArr, int i7, int i8) throws IOException {
            zzc(bArr, i7, i8);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzb(byte[] bArr, int i7, int i8) throws IOException {
            zzm(i8);
            zzc(bArr, 0, i8);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzf(long j7) throws IOException {
            zzp(8);
            zzi(j7);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzh(int i7, long j7) throws IOException {
            zzp(20);
            zzl(i7, 0);
            zzj(j7);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzb(zzajv zzajvVar) {
            zzm(zzajvVar.zzb());
            zzajvVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzb(zzamm zzammVar) {
            zzm(zzammVar.zzl());
            zzammVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzh(long j7) throws IOException {
            zzp(10);
            zzj(j7);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzb(int i7, zzamm zzammVar) {
            zzj(1, 3);
            zzk(2, i7);
            zzj(3, 2);
            zzb(zzammVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzb(int i7, String str) {
            zzj(i7, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzc(int i7, zzajv zzajvVar) {
            zzj(i7, 2);
            zzb(zzajvVar);
        }

        @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakn
        public final void zzb(String str) throws IOException {
            int iZza;
            try {
                int length = str.length() * 3;
                int iZzi = zzakn.zzi(length);
                int i7 = iZzi + length;
                int i8 = this.zzc;
                if (i7 > i8) {
                    byte[] bArr = new byte[length];
                    int iZza2 = zzaoa.zza(str, bArr, 0, length);
                    zzm(iZza2);
                    zza(bArr, 0, iZza2);
                    return;
                }
                if (i7 > i8 - this.zzd) {
                    zze();
                }
                int iZzi2 = zzakn.zzi(str.length());
                int i9 = this.zzd;
                try {
                    if (iZzi2 == iZzi) {
                        int i10 = i9 + iZzi2;
                        this.zzd = i10;
                        int iZza3 = zzaoa.zza(str, this.zzb, i10, this.zzc - i10);
                        this.zzd = i9;
                        iZza = (iZza3 - i9) - iZzi2;
                        zzo(iZza);
                        this.zzd = iZza3;
                    } else {
                        iZza = zzaoa.zza(str);
                        zzo(iZza);
                        this.zzd = zzaoa.zza(str, this.zzb, this.zzd, iZza);
                    }
                    this.zze += iZza;
                } catch (zzaod e7) {
                    this.zze -= this.zzd - i9;
                    this.zzd = i9;
                    throw e7;
                } catch (ArrayIndexOutOfBoundsException e8) {
                    throw new zzd(e8);
                }
            } catch (zzaod e9) {
                zza(str, e9);
            }
        }
    }

    private zzakn() {
    }

    public static int zza(float f7) {
        return 4;
    }

    public static int zzb(int i7, int i8) {
        return zzi(i7 << 3) + 4;
    }

    public static int zzc(int i7, int i8) {
        return zzi(i7 << 3) + zze(i8);
    }

    static int zzd(int i7) {
        return zzi(i7) + i7;
    }

    public static int zze(int i7, int i8) {
        return zzi(i7 << 3) + zzi(zzn(i8));
    }

    public static int zzf(int i7, int i8) {
        return zzi(i7 << 3) + zzi(i8);
    }

    public static int zzi(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    public final void zzg(int i7, long j7) {
        zzh(i7, zzi(j7));
    }

    public static int zza(long j7) {
        return 8;
    }

    public static int zzb(int i7, long j7) {
        return zzi(i7 << 3) + zze(j7);
    }

    public static int zzd(int i7, int i8) {
        return zzi(i7 << 3) + 4;
    }

    public final void zzg(long j7) {
        zzh(zzi(j7));
    }

    public final void zzi(int i7, int i8) {
        zzk(i7, zzn(i8));
    }

    public static int zza(boolean z7) {
        return 1;
    }

    public static int zzc(int i7) {
        return zze(i7);
    }

    public static int zzd(int i7, long j7) {
        return zzi(i7 << 3) + zze(zzi(j7));
    }

    public static int zze(int i7, long j7) {
        return zzi(i7 << 3) + zze(j7);
    }

    public static int zza(int i7, boolean z7) {
        return zzi(i7 << 3) + 1;
    }

    public static int zzb(long j7) {
        return zze(j7);
    }

    public static int zzc(int i7, long j7) {
        return zzi(i7 << 3) + 8;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzi(length) + length;
    }

    public static int zzb(int i7, zzalu zzaluVar) {
        int iZzi = zzi(i7 << 3);
        int iZza = zzaluVar.zza();
        return iZzi + zzi(iZza) + iZza;
    }

    public static int zzd(long j7) {
        return zze(zzi(j7));
    }

    public static int zze(long j7) {
        return (640 - (Long.numberOfLeadingZeros(j7) * 9)) >>> 6;
    }

    public static int zza(int i7, zzajv zzajvVar) {
        int iZzi = zzi(i7 << 3);
        int iZzb = zzajvVar.zzb();
        return iZzi + zzi(iZzb) + iZzb;
    }

    public static int zzb(int i7, zzajv zzajvVar) {
        return (zzi(8) << 1) + zzf(2, i7) + zza(3, zzajvVar);
    }

    public static int zza(zzajv zzajvVar) {
        int iZzb = zzajvVar.zzb();
        return zzi(iZzb) + iZzb;
    }

    public static zzakn zzb(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public static int zza(int i7, double d7) {
        return zzi(i7 << 3) + 8;
    }

    public static int zza(int i7, int i8) {
        return zzi(i7 << 3) + zze(i8);
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public static int zza(int i7) {
        return zze(i7);
    }

    public final void zzb(boolean z7) {
        zza(z7 ? (byte) 1 : (byte) 0);
    }

    public static int zza(int i7, long j7) {
        return zzi(i7 << 3) + 8;
    }

    public final void zzb(int i7, double d7) {
        zzf(i7, Double.doubleToRawLongBits(d7));
    }

    public static int zza(int i7, float f7) {
        return zzi(i7 << 3) + 4;
    }

    public final void zzb(double d7) {
        zzf(Double.doubleToRawLongBits(d7));
    }

    public static int zza(int i7, zzalu zzaluVar) {
        return (zzi(8) << 1) + zzf(2, i7) + zzb(3, zzaluVar);
    }

    public final void zzb(int i7, float f7) {
        zzg(i7, Float.floatToRawIntBits(f7));
    }

    public final void zzb(float f7) {
        zzj(Float.floatToRawIntBits(f7));
    }

    public static int zza(zzalu zzaluVar) {
        int iZza = zzaluVar.zza();
        return zzi(iZza) + iZza;
    }

    public static int zza(int i7, zzamm zzammVar) {
        return (zzi(8) << 1) + zzf(2, i7) + zzi(24) + zza(zzammVar);
    }

    public static int zza(zzamm zzammVar) {
        int iZzl = zzammVar.zzl();
        return zzi(iZzl) + iZzl;
    }

    public static int zza(int i7, String str) {
        return zzi(i7 << 3) + zza(str);
    }

    public static int zza(String str) {
        int length;
        try {
            length = zzaoa.zza(str);
        } catch (zzaod unused) {
            length = str.getBytes(zzalh.zza).length;
        }
        return zzi(length) + length;
    }

    public static zzakn zza(OutputStream outputStream, int i7) {
        return new zzc(outputStream, i7);
    }

    final void zza(String str, zzaod zzaodVar) throws zzd {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzaodVar);
        byte[] bytes = str.getBytes(zzalh.zza);
        try {
            zzm(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzd(e7);
        }
    }
}
