package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ParcelFileDescriptorRewinder implements InterfaceC3220e {

    /* JADX INFO: renamed from: a */
    private final InternalRewinder f13801a;

    private static final class InternalRewinder {

        /* JADX INFO: renamed from: a */
        private final ParcelFileDescriptor f13802a;

        InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f13802a = parcelFileDescriptor;
        }

        ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.f13802a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f13802a;
            } catch (ErrnoException e7) {
                throw new IOException(e7);
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a */
    public static final class C3215a implements InterfaceC3220e.a {
        @Override // com.bumptech.glide.load.data.InterfaceC3220e.a
        /* JADX INFO: renamed from: a */
        public Class mo4043a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3220e.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC3220e mo4044b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f13801a = new InternalRewinder(parcelFileDescriptor);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m17102c() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3220e
    /* JADX INFO: renamed from: b */
    public void mo4041b() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3220e
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo4040a() {
        return this.f13801a.rewind();
    }
}
