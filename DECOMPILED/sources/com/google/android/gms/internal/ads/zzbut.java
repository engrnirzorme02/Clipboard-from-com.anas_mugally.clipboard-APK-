package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.common.util.AbstractC3756k;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;
import p177X2.InterfaceC1948d;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbut extends AbstractC1945a {
    public static final Parcelable.Creator<zzbut> CREATOR = new zzbuu();
    ParcelFileDescriptor zza;
    private Parcelable zzb = null;
    private boolean zzc = true;

    public zzbut(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.zza == null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                this.zzb.writeToParcel(parcelObtain, 0);
                final byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
                    try {
                        zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbus
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() throws Throwable {
                                Parcelable.Creator<zzbut> creator = zzbut.CREATOR;
                                byte[] bArr = bArrMarshall;
                                OutputStream outputStream = autoCloseOutputStream;
                                DataOutputStream dataOutputStream = null;
                                try {
                                    try {
                                        DataOutputStream dataOutputStream2 = new DataOutputStream(outputStream);
                                        try {
                                            dataOutputStream2.writeInt(bArr.length);
                                            dataOutputStream2.write(bArr);
                                            AbstractC3756k.m18186a(dataOutputStream2);
                                        } catch (IOException e7) {
                                            e = e7;
                                            dataOutputStream = dataOutputStream2;
                                            int i8 = AbstractC3490o0.f14278b;
                                            AbstractC7599p.m33329d("Error transporting the ad response", e);
                                            C7351t.m32354l().zzg(e, "LargeParcelTeleporter.pipeData.1");
                                            if (dataOutputStream == null) {
                                                AbstractC3756k.m18186a(outputStream);
                                            } else {
                                                AbstractC3756k.m18186a(dataOutputStream);
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            dataOutputStream = dataOutputStream2;
                                            if (dataOutputStream == null) {
                                                AbstractC3756k.m18186a(outputStream);
                                            } else {
                                                AbstractC3756k.m18186a(dataOutputStream);
                                            }
                                            throw th;
                                        }
                                    } catch (IOException e8) {
                                        e = e8;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        });
                        parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                    } catch (IOException e7) {
                        e = e7;
                        int i8 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33329d("Error transporting the ad response", e);
                        C7351t.m32354l().zzg(e, "LargeParcelTeleporter.pipeData.2");
                        AbstractC3756k.m18186a(autoCloseOutputStream);
                    }
                } catch (IOException e8) {
                    e = e8;
                    autoCloseOutputStream = null;
                }
                this.zza = parcelFileDescriptor;
            } catch (Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8042C(parcel, 2, this.zza, i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public final InterfaceC1948d zza(Parcelable.Creator creator) {
        if (this.zzc) {
            if (this.zza == null) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33328c("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.zza));
            try {
                try {
                    int i8 = dataInputStream.readInt();
                    byte[] bArr = new byte[i8];
                    dataInputStream.readFully(bArr, 0, i8);
                    AbstractC3756k.m18186a(dataInputStream);
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.unmarshall(bArr, 0, i8);
                        parcelObtain.setDataPosition(0);
                        this.zzb = (Parcelable) creator.createFromParcel(parcelObtain);
                        parcelObtain.recycle();
                        this.zzc = false;
                    } catch (Throwable th) {
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (IOException e7) {
                    int i9 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33329d("Could not read from parcel file descriptor", e7);
                    AbstractC3756k.m18186a(dataInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                AbstractC3756k.m18186a(dataInputStream);
                throw th2;
            }
        }
        return (InterfaceC1948d) this.zzb;
    }
}
