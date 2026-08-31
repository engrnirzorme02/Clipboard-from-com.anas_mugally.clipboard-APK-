package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqh extends zzcg {
    private int[] zzd;
    private int[] zze;

    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:56:0x0115  */
    @Override // com.google.android.gms.internal.ads.zzcf
    public final void zzd(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder;
        ByteOrder byteOrder;
        int i7;
        int i8;
        int i9;
        boolean z7;
        int i10;
        int i11;
        int[] iArr = this.zze;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferZzk = zzk(((iLimit - iPosition) / this.zzb.zze) * this.zzc.zze);
        while (iPosition < iLimit) {
            for (int i12 : iArr) {
                int iZzE = (zzeo.zzE(this.zzb.zzd) * i12) + iPosition;
                int i13 = this.zzb.zzd;
                if (i13 == 2) {
                    byteBufferZzk.putShort(byteBuffer.getShort(iZzE));
                } else if (i13 == 3) {
                    byteBufferZzk.put(byteBuffer.get(iZzE));
                } else if (i13 == 4) {
                    byteBufferZzk.putFloat(byteBuffer.getFloat(iZzE));
                } else if (i13 == 21) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i7 = iZzE;
                    } else {
                        i7 = iZzE + 2;
                    }
                    byte b7 = byteBuffer.get(i7);
                    byte b8 = byteBuffer.get(iZzE + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iZzE += 2;
                    }
                    i8 = ((b7 << 24) & (-16777216)) | ((b8 << 16) & 16711680) | ((byteBuffer.get(iZzE) << 8) & 65280);
                    i9 = i8 >> 8;
                    if ((i9 & (-16777216)) != 0 || (i9 & (-8388608)) == -8388608) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    zzghc.zzf(z7, "Value out of range of 24-bit integer: %s", Integer.toHexString(i9));
                    zzghc.zza(byteBufferZzk.remaining() >= 3);
                    if (byteBufferZzk.order() == byteOrder) {
                        i10 = (i8 >> 24) & 255;
                    } else {
                        i10 = i9 & 255;
                    }
                    byte b9 = (byte) i10;
                    int i14 = (i8 >> 16) & 255;
                    if (byteBufferZzk.order() == byteOrder) {
                        i11 = i9 & 255;
                    } else {
                        i11 = (i8 >> 24) & 255;
                    }
                    byteBufferZzk.put(b9).put((byte) i14).put((byte) i11);
                } else {
                    if (i13 != 22) {
                        if (i13 == 268435456) {
                            byteBufferZzk.putShort(byteBuffer.getShort(iZzE));
                        } else if (i13 == 1342177280) {
                            byteOrderOrder = byteBuffer.order();
                            byteOrder = ByteOrder.BIG_ENDIAN;
                            if (byteOrderOrder == byteOrder) {
                                i7 = iZzE;
                            } else {
                                i7 = iZzE + 2;
                            }
                            byte b10 = byteBuffer.get(i7);
                            byte b11 = byteBuffer.get(iZzE + 1);
                            if (byteBuffer.order() == byteOrder) {
                                iZzE += 2;
                            }
                            i8 = ((b10 << 24) & (-16777216)) | ((b11 << 16) & 16711680) | ((byteBuffer.get(iZzE) << 8) & 65280);
                            i9 = i8 >> 8;
                            if ((i9 & (-16777216)) != 0) {
                                z7 = true;
                            } else {
                                z7 = true;
                            }
                            zzghc.zzf(z7, "Value out of range of 24-bit integer: %s", Integer.toHexString(i9));
                            zzghc.zza(byteBufferZzk.remaining() >= 3);
                            if (byteBufferZzk.order() == byteOrder) {
                                i10 = (i8 >> 24) & 255;
                            } else {
                                i10 = i9 & 255;
                            }
                            byte b12 = (byte) i10;
                            int i15 = (i8 >> 16) & 255;
                            if (byteBufferZzk.order() == byteOrder) {
                                i11 = i9 & 255;
                            } else {
                                i11 = (i8 >> 24) & 255;
                            }
                            byteBufferZzk.put(b12).put((byte) i15).put((byte) i11);
                        } else if (i13 != 1610612736) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i13).length() + 21);
                            sb.append("Unexpected encoding: ");
                            sb.append(i13);
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    byteBufferZzk.putInt(byteBuffer.getInt(iZzE));
                }
            }
            iPosition += this.zzb.zze;
        }
        byteBuffer.position(iLimit);
        byteBufferZzk.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final zzcc zzm(zzcc zzccVar) throws zzce {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzcc.zza;
        }
        int i7 = zzccVar.zzd;
        if (!zzeo.zzA(i7)) {
            throw new zzce("Unhandled input format:", zzccVar);
        }
        int i8 = zzccVar.zzc;
        boolean z7 = i8 != iArr.length;
        int i9 = 0;
        while (true) {
            int length = iArr.length;
            if (i9 >= length) {
                return z7 ? new zzcc(zzccVar.zzb, length, i7) : zzcc.zza;
            }
            int i10 = iArr[i9];
            if (i10 >= i8) {
                String string = Arrays.toString(iArr);
                StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 59);
                sb.append("Channel map (");
                sb.append(string);
                sb.append(") trying to access non-existent input channel.");
                throw new zzce(sb.toString(), zzccVar);
            }
            z7 |= i10 != i9;
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    protected final void zzo() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    protected final void zzp() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzq(int[] iArr) {
        this.zzd = iArr;
    }
}
