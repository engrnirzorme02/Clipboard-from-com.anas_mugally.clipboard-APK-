package p394y0;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC6118n;
import p002A0.AbstractC0004b;
import p002A0.AbstractC0005c;
import p026D0.InterfaceC0176g;
import p026D0.InterfaceC0177h;
import p042F0.C0402a;

/* JADX INFO: renamed from: y0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C7466u implements InterfaceC0177h, InterfaceC7452g {

    /* JADX INFO: renamed from: a */
    private final Context f29982a;

    /* JADX INFO: renamed from: b */
    private final String f29983b;

    /* JADX INFO: renamed from: c */
    private final File f29984c;

    /* JADX INFO: renamed from: d */
    private final Callable f29985d;

    /* JADX INFO: renamed from: e */
    private final int f29986e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC0177h f29987f;

    /* JADX INFO: renamed from: r */
    private C7451f f29988r;

    /* JADX INFO: renamed from: s */
    private boolean f29989s;

    public C7466u(Context context, String str, File file, Callable callable, int i7, InterfaceC0177h delegate) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(delegate, "delegate");
        this.f29982a = context;
        this.f29983b = str;
        this.f29984c = file;
        this.f29985d = callable;
        this.f29986e = i7;
        this.f29987f = delegate;
    }

    /* JADX INFO: renamed from: J */
    private final void m33075J(boolean z7) {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databaseFile = this.f29982a.getDatabasePath(databaseName);
        C7451f c7451f = this.f29988r;
        C7451f c7451f2 = null;
        if (c7451f == null) {
            AbstractC6118n.m27197o("databaseConfiguration");
            c7451f = null;
        }
        C0402a c0402a = new C0402a(databaseName, this.f29982a.getFilesDir(), c7451f.f29907s);
        try {
            C0402a.m1727c(c0402a, false, 1, null);
            if (!databaseFile.exists()) {
                try {
                    AbstractC6118n.m27186d(databaseFile, "databaseFile");
                    m33076m(databaseFile, z7);
                    c0402a.m1729d();
                    return;
                } catch (IOException e7) {
                    throw new RuntimeException("Unable to copy database file.", e7);
                }
            }
            try {
                AbstractC6118n.m27186d(databaseFile, "databaseFile");
                int iM6c = AbstractC0004b.m6c(databaseFile);
                if (iM6c == this.f29986e) {
                    c0402a.m1729d();
                    return;
                }
                C7451f c7451f3 = this.f29988r;
                if (c7451f3 == null) {
                    AbstractC6118n.m27197o("databaseConfiguration");
                } else {
                    c7451f2 = c7451f3;
                }
                if (c7451f2.m33012a(iM6c, this.f29986e)) {
                    c0402a.m1729d();
                    return;
                }
                if (this.f29982a.deleteDatabase(databaseName)) {
                    try {
                        m33076m(databaseFile, z7);
                    } catch (IOException e8) {
                        Log.w("ROOM", "Unable to copy database file.", e8);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                c0402a.m1729d();
                return;
            } catch (IOException e9) {
                Log.w("ROOM", "Unable to read database version.", e9);
                c0402a.m1729d();
                return;
            }
        } catch (Throwable th) {
            c0402a.m1729d();
            throw th;
        }
        c0402a.m1729d();
        throw th;
    }

    /* JADX INFO: renamed from: m */
    private final void m33076m(File file, boolean z7) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.f29983b != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.f29982a.getAssets().open(this.f29983b));
            AbstractC6118n.m27186d(readableByteChannelNewChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.f29984c != null) {
            readableByteChannelNewChannel = new FileInputStream(this.f29984c).getChannel();
            AbstractC6118n.m27186d(readableByteChannelNewChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable callable = this.f29985d;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel((InputStream) callable.call());
                AbstractC6118n.m27186d(readableByteChannelNewChannel, "newChannel(inputStream)");
            } catch (Exception e7) {
                throw new IOException("inputStreamCallable exception on call", e7);
            }
        }
        File intermediateFile = File.createTempFile("room-copy-helper", ".tmp", this.f29982a.getCacheDir());
        intermediateFile.deleteOnExit();
        FileChannel output = new FileOutputStream(intermediateFile).getChannel();
        AbstractC6118n.m27186d(output, "output");
        AbstractC0005c.m7a(readableByteChannelNewChannel, output);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        AbstractC6118n.m27186d(intermediateFile, "intermediateFile");
        m33077n(intermediateFile, z7);
        if (intermediateFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + intermediateFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    /* JADX INFO: renamed from: n */
    private final void m33077n(File file, boolean z7) {
        C7451f c7451f = this.f29988r;
        if (c7451f == null) {
            AbstractC6118n.m27197o("databaseConfiguration");
            c7451f = null;
        }
        c7451f.getClass();
    }

    @Override // p026D0.InterfaceC0177h
    /* JADX INFO: renamed from: Y */
    public InterfaceC0176g mo892Y() {
        if (!this.f29989s) {
            m33075J(true);
            this.f29989s = true;
        }
        return mo32994d().mo892Y();
    }

    @Override // p026D0.InterfaceC0177h, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        mo32994d().close();
        this.f29989s = false;
    }

    @Override // p394y0.InterfaceC7452g
    /* JADX INFO: renamed from: d */
    public InterfaceC0177h mo32994d() {
        return this.f29987f;
    }

    @Override // p026D0.InterfaceC0177h
    public String getDatabaseName() {
        return mo32994d().getDatabaseName();
    }

    @Override // p026D0.InterfaceC0177h
    public void setWriteAheadLoggingEnabled(boolean z7) {
        mo32994d().setWriteAheadLoggingEnabled(z7);
    }

    /* JADX INFO: renamed from: x */
    public final void m33078x(C7451f databaseConfiguration) {
        AbstractC6118n.m27187e(databaseConfiguration, "databaseConfiguration");
        this.f29988r = databaseConfiguration;
    }
}
