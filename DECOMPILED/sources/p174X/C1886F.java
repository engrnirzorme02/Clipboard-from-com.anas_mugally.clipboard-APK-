package p174X;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p238e6.InterfaceC5356a;

/* JADX INFO: renamed from: X.F */
/* JADX INFO: loaded from: classes.dex */
public final class C1886F {

    /* JADX INFO: renamed from: b */
    public static final a f6065b = new a(null);

    /* JADX INFO: renamed from: c */
    private static final NativeSharedCounter f6066c = new NativeSharedCounter();

    /* JADX INFO: renamed from: a */
    private final long f6067a;

    /* JADX INFO: renamed from: X.F$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: b */
        private final C1886F m7806b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            int fd = parcelFileDescriptor.getFd();
            if (m7808c().nativeTruncateFile(fd) != 0) {
                throw new IOException("Failed to truncate counter file");
            }
            long jNativeCreateSharedCounter = m7808c().nativeCreateSharedCounter(fd);
            if (jNativeCreateSharedCounter >= 0) {
                return new C1886F(jNativeCreateSharedCounter, null);
            }
            throw new IOException("Failed to mmap counter file");
        }

        /* JADX INFO: renamed from: a */
        public final C1886F m7807a(InterfaceC5356a produceFile) throws Throwable {
            ParcelFileDescriptor parcelFileDescriptorOpen;
            AbstractC6118n.m27187e(produceFile, "produceFile");
            try {
                parcelFileDescriptorOpen = ParcelFileDescriptor.open((File) produceFile.invoke(), 939524096);
                try {
                    C1886F c1886fM7806b = m7806b(parcelFileDescriptorOpen);
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    return c1886fM7806b;
                } catch (Throwable th) {
                    th = th;
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                parcelFileDescriptorOpen = null;
            }
        }

        /* JADX INFO: renamed from: c */
        public final NativeSharedCounter m7808c() {
            return C1886F.f6066c;
        }

        /* JADX INFO: renamed from: d */
        public final void m7809d() {
            System.loadLibrary("datastore_shared_counter");
        }

        private a() {
        }
    }

    public /* synthetic */ C1886F(long j7, AbstractC6112h abstractC6112h) {
        this(j7);
    }

    /* JADX INFO: renamed from: b */
    public final int m7804b() {
        return f6066c.nativeGetCounterValue(this.f6067a);
    }

    /* JADX INFO: renamed from: c */
    public final int m7805c() {
        return f6066c.nativeIncrementAndGetCounterValue(this.f6067a);
    }

    private C1886F(long j7) {
        this.f6067a = j7;
    }
}
