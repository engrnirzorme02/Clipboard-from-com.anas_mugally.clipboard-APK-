package p042F0;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: F0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0402a {

    /* JADX INFO: renamed from: e */
    public static final a f1614e = new a(null);

    /* JADX INFO: renamed from: f */
    private static final Map f1615f = new HashMap();

    /* JADX INFO: renamed from: a */
    private final boolean f1616a;

    /* JADX INFO: renamed from: b */
    private final File f1617b;

    /* JADX INFO: renamed from: c */
    private final Lock f1618c;

    /* JADX INFO: renamed from: d */
    private FileChannel f1619d;

    /* JADX INFO: renamed from: F0.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public final Lock m1731b(String str) {
            Lock lock;
            synchronized (C0402a.f1615f) {
                try {
                    Map map = C0402a.f1615f;
                    Object reentrantLock = map.get(str);
                    if (reentrantLock == null) {
                        reentrantLock = new ReentrantLock();
                        map.put(str, reentrantLock);
                    }
                    lock = (Lock) reentrantLock;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lock;
        }

        private a() {
        }
    }

    public C0402a(String name, File file, boolean z7) {
        File file2;
        AbstractC6118n.m27187e(name, "name");
        this.f1616a = z7;
        if (file != null) {
            file2 = new File(file, name + ".lck");
        } else {
            file2 = null;
        }
        this.f1617b = file2;
        this.f1618c = f1614e.m1731b(name);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m1727c(C0402a c0402a, boolean z7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = c0402a.f1616a;
        }
        c0402a.m1728b(z7);
    }

    /* JADX INFO: renamed from: b */
    public final void m1728b(boolean z7) {
        this.f1618c.lock();
        if (z7) {
            try {
                File file = this.f1617b;
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f1617b).getChannel();
                channel.lock();
                this.f1619d = channel;
            } catch (IOException e7) {
                this.f1619d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e7);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1729d() {
        try {
            FileChannel fileChannel = this.f1619d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f1618c.unlock();
    }
}
