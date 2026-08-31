package androidx.exifinterface.media;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;

/* JADX INFO: renamed from: androidx.exifinterface.media.b */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2573b {

    /* JADX INFO: renamed from: androidx.exifinterface.media.b$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static void m11930a(FileDescriptor fileDescriptor) throws ErrnoException {
            Os.close(fileDescriptor);
        }

        /* JADX INFO: renamed from: b */
        static FileDescriptor m11931b(FileDescriptor fileDescriptor) {
            return Os.dup(fileDescriptor);
        }

        /* JADX INFO: renamed from: c */
        static long m11932c(FileDescriptor fileDescriptor, long j7, int i7) {
            return Os.lseek(fileDescriptor, j7, i7);
        }
    }

    /* JADX INFO: renamed from: androidx.exifinterface.media.b$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static void m11933a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    /* JADX INFO: renamed from: a */
    static String m11927a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b7 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b7)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    static long[] m11928b(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            jArr[i7] = iArr[i7];
        }
        return jArr;
    }

    /* JADX INFO: renamed from: c */
    static boolean m11929c(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i7 = 0; i7 < bArr2.length; i7++) {
            if (bArr[i7] != bArr2[i7]) {
                return false;
            }
        }
        return true;
    }
}
