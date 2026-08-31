package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.profileinstaller.b */
/* JADX INFO: loaded from: classes.dex */
public class C2729b {

    /* JADX INFO: renamed from: a */
    private final AssetManager f10660a;

    /* JADX INFO: renamed from: b */
    private final Executor f10661b;

    /* JADX INFO: renamed from: c */
    private final AbstractC2733f.c f10662c;

    /* JADX INFO: renamed from: e */
    private final File f10664e;

    /* JADX INFO: renamed from: f */
    private final String f10665f;

    /* JADX INFO: renamed from: g */
    private final String f10666g;

    /* JADX INFO: renamed from: h */
    private final String f10667h;

    /* JADX INFO: renamed from: j */
    private C2730c[] f10669j;

    /* JADX INFO: renamed from: k */
    private byte[] f10670k;

    /* JADX INFO: renamed from: i */
    private boolean f10668i = false;

    /* JADX INFO: renamed from: d */
    private final byte[] f10663d = m12858d();

    public C2729b(AssetManager assetManager, Executor executor, AbstractC2733f.c cVar, String str, String str2, String str3, File file) {
        this.f10660a = assetManager;
        this.f10661b = executor;
        this.f10662c = cVar;
        this.f10665f = str;
        this.f10666g = str2;
        this.f10667h = str3;
        this.f10664e = file;
    }

    /* JADX INFO: renamed from: b */
    private C2729b m12856b(C2730c[] c2730cArr, byte[] bArr) {
        try {
            InputStream inputStreamM12860g = m12860g(this.f10660a, this.f10667h);
            if (inputStreamM12860g == null) {
                if (inputStreamM12860g != null) {
                    inputStreamM12860g.close();
                }
                return null;
            }
            try {
                this.f10669j = AbstractC2734g.m12933r(inputStreamM12860g, AbstractC2734g.m12931p(inputStreamM12860g, AbstractC2734g.f10690b), bArr, c2730cArr);
                inputStreamM12860g.close();
                return this;
            } catch (Throwable th) {
                try {
                    inputStreamM12860g.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException e7) {
            this.f10662c.mo12843b(9, e7);
        } catch (IOException e8) {
            this.f10662c.mo12843b(7, e8);
        } catch (IllegalStateException e9) {
            this.f10669j = null;
            this.f10662c.mo12843b(8, e9);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m12857c() {
        if (!this.f10668i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    /* JADX INFO: renamed from: d */
    private static byte[] m12858d() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            return AbstractC2736i.f10702a;
        }
        switch (i7) {
            case 26:
                return AbstractC2736i.f10705d;
            case 27:
                return AbstractC2736i.f10704c;
            case 28:
            case 29:
            case 30:
                return AbstractC2736i.f10703b;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: f */
    private InputStream m12859f(AssetManager assetManager) {
        try {
            return m12860g(assetManager, this.f10666g);
        } catch (FileNotFoundException e7) {
            this.f10662c.mo12843b(6, e7);
            return null;
        } catch (IOException e8) {
            this.f10662c.mo12843b(7, e8);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    private InputStream m12860g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e7) {
            String message = e7.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f10662c.mo12842a(5, null);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    private C2730c[] m12861i(InputStream inputStream) {
        try {
            try {
                try {
                    try {
                        C2730c[] c2730cArrM12939x = AbstractC2734g.m12939x(inputStream, AbstractC2734g.m12931p(inputStream, AbstractC2734g.f10689a), this.f10665f);
                        try {
                            return c2730cArrM12939x;
                        } catch (IOException e7) {
                            return c2730cArrM12939x;
                        }
                    } catch (IOException e8) {
                        this.f10662c.mo12843b(7, e8);
                        return null;
                    }
                } catch (IllegalStateException e9) {
                    this.f10662c.mo12843b(8, e9);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e10) {
                this.f10662c.mo12843b(7, e10);
                inputStream.close();
                return null;
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException e11) {
                this.f10662c.mo12843b(7, e11);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    private static boolean m12862j() {
        return Build.VERSION.SDK_INT >= 31;
    }

    /* JADX INFO: renamed from: k */
    private void m12863k(final int i7, final Object obj) {
        this.f10661b.execute(new Runnable() { // from class: w0.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f29119a.f10662c.mo12843b(i7, obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public boolean m12864e() {
        if (this.f10663d == null) {
            m12863k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f10664e.exists()) {
            try {
                if (!this.f10664e.createNewFile()) {
                    m12863k(4, null);
                    return false;
                }
            } catch (IOException unused) {
                m12863k(4, null);
                return false;
            }
        } else if (!this.f10664e.canWrite()) {
            m12863k(4, null);
            return false;
        }
        this.f10668i = true;
        return true;
    }

    /* JADX INFO: renamed from: h */
    public C2729b m12865h() {
        C2729b c2729bM12856b;
        m12857c();
        if (this.f10663d != null) {
            InputStream inputStreamM12859f = m12859f(this.f10660a);
            if (inputStreamM12859f != null) {
                this.f10669j = m12861i(inputStreamM12859f);
            }
            C2730c[] c2730cArr = this.f10669j;
            if (c2730cArr != null && m12862j() && (c2729bM12856b = m12856b(c2730cArr, this.f10663d)) != null) {
                return c2729bM12856b;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: l */
    public C2729b m12866l() {
        C2730c[] c2730cArr = this.f10669j;
        byte[] bArr = this.f10663d;
        if (c2730cArr != null && bArr != null) {
            m12857c();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    AbstractC2734g.m12904F(byteArrayOutputStream, bArr);
                    if (!AbstractC2734g.m12901C(byteArrayOutputStream, bArr, c2730cArr)) {
                        this.f10662c.mo12843b(5, null);
                        this.f10669j = null;
                        byteArrayOutputStream.close();
                        return this;
                    }
                    this.f10670k = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    this.f10669j = null;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e7) {
                this.f10662c.mo12843b(7, e7);
            } catch (IllegalStateException e8) {
                this.f10662c.mo12843b(8, e8);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: m */
    public boolean m12867m() {
        byte[] bArr = this.f10670k;
        if (bArr == null) {
            return false;
        }
        m12857c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f10664e);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            FileLock fileLockTryLock = channel.tryLock();
                            try {
                                AbstractC2731d.m12879l(byteArrayInputStream, fileOutputStream, fileLockTryLock);
                                m12863k(1, null);
                                if (fileLockTryLock != null) {
                                    fileLockTryLock.close();
                                }
                                channel.close();
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                this.f10670k = null;
                                this.f10669j = null;
                                return true;
                            } catch (Throwable th) {
                                if (fileLockTryLock != null) {
                                    try {
                                        fileLockTryLock.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            if (channel != null) {
                                try {
                                    channel.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                    throw th7;
                }
            } catch (FileNotFoundException e7) {
                m12863k(6, e7);
                this.f10670k = null;
                this.f10669j = null;
                return false;
            } catch (IOException e8) {
                m12863k(7, e8);
                this.f10670k = null;
                this.f10669j = null;
                return false;
            }
        } catch (Throwable th9) {
            this.f10670k = null;
            this.f10669j = null;
            throw th9;
        }
    }
}
