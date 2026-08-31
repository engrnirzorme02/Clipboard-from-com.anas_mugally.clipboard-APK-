package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import p033E.AbstractC0271z;
import p081K.AbstractC0723o;
import p089L.AbstractC0776l;
import p089L.C0769e;
import p104N.AbstractC0910g;

/* JADX INFO: renamed from: androidx.emoji2.text.k */
/* JADX INFO: loaded from: classes.dex */
public class C2563k extends C2558f.c {

    /* JADX INFO: renamed from: k */
    private static final a f9874k = new a();

    /* JADX INFO: renamed from: androidx.emoji2.text.k$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public Typeface m11807a(Context context, AbstractC0776l.b bVar) {
            return AbstractC0776l.m3636a(context, null, new AbstractC0776l.b[]{bVar});
        }

        /* JADX INFO: renamed from: b */
        public AbstractC0776l.a m11808b(Context context, C0769e c0769e) {
            return AbstractC0776l.m3637b(context, null, c0769e);
        }

        /* JADX INFO: renamed from: c */
        public void m11809c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.emoji2.text.k$b */
    static class b implements C2558f.h {

        /* JADX INFO: renamed from: a */
        private final Context f9875a;

        /* JADX INFO: renamed from: b */
        private final C0769e f9876b;

        /* JADX INFO: renamed from: c */
        private final a f9877c;

        /* JADX INFO: renamed from: d */
        private final Object f9878d = new Object();

        /* JADX INFO: renamed from: e */
        private Handler f9879e;

        /* JADX INFO: renamed from: f */
        private Executor f9880f;

        /* JADX INFO: renamed from: g */
        private ThreadPoolExecutor f9881g;

        /* JADX INFO: renamed from: h */
        C2558f.i f9882h;

        /* JADX INFO: renamed from: i */
        private ContentObserver f9883i;

        /* JADX INFO: renamed from: j */
        private Runnable f9884j;

        b(Context context, C0769e c0769e, a aVar) {
            AbstractC0910g.m4140h(context, "Context cannot be null");
            AbstractC0910g.m4140h(c0769e, "FontRequest cannot be null");
            this.f9875a = context.getApplicationContext();
            this.f9876b = c0769e;
            this.f9877c = aVar;
        }

        /* JADX INFO: renamed from: b */
        private void m11810b() {
            synchronized (this.f9878d) {
                try {
                    this.f9882h = null;
                    ContentObserver contentObserver = this.f9883i;
                    if (contentObserver != null) {
                        this.f9877c.m11809c(this.f9875a, contentObserver);
                        this.f9883i = null;
                    }
                    Handler handler = this.f9879e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f9884j);
                    }
                    this.f9879e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f9881g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f9880f = null;
                    this.f9881g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: e */
        private AbstractC0776l.b m11811e() {
            try {
                AbstractC0776l.a aVarM11808b = this.f9877c.m11808b(this.f9875a, this.f9876b);
                if (aVarM11808b.m3643e() == 0) {
                    AbstractC0776l.b[] bVarArrM3641c = aVarM11808b.m3641c();
                    if (bVarArrM3641c == null || bVarArrM3641c.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrM3641c[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarM11808b.m3643e() + ")");
            } catch (PackageManager.NameNotFoundException e7) {
                throw new RuntimeException("provider not found", e7);
            }
        }

        @Override // androidx.emoji2.text.C2558f.h
        /* JADX INFO: renamed from: a */
        public void mo11726a(C2558f.i iVar) {
            AbstractC0910g.m4140h(iVar, "LoaderCallback cannot be null");
            synchronized (this.f9878d) {
                this.f9882h = iVar;
            }
            m11813d();
        }

        /* JADX INFO: renamed from: c */
        void m11812c() {
            synchronized (this.f9878d) {
                try {
                    if (this.f9882h == null) {
                        return;
                    }
                    try {
                        AbstractC0776l.b bVarM11811e = m11811e();
                        int iM3646b = bVarM11811e.m3646b();
                        if (iM3646b == 2) {
                            synchronized (this.f9878d) {
                            }
                        }
                        if (iM3646b != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iM3646b + ")");
                        }
                        try {
                            AbstractC0723o.m3486a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceM11807a = this.f9877c.m11807a(this.f9875a, bVarM11811e);
                            ByteBuffer byteBufferM1276e = AbstractC0271z.m1276e(this.f9875a, null, bVarM11811e.m3649e());
                            if (byteBufferM1276e == null || typefaceM11807a == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            C2566n c2566nM11824b = C2566n.m11824b(typefaceM11807a, byteBufferM1276e);
                            AbstractC0723o.m3487b();
                            synchronized (this.f9878d) {
                                try {
                                    C2558f.i iVar = this.f9882h;
                                    if (iVar != null) {
                                        iVar.mo11729b(c2566nM11824b);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            m11810b();
                        } catch (Throwable th2) {
                            AbstractC0723o.m3487b();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        synchronized (this.f9878d) {
                            try {
                                C2558f.i iVar2 = this.f9882h;
                                if (iVar2 != null) {
                                    iVar2.mo11728a(th3);
                                }
                                m11810b();
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        void m11813d() {
            synchronized (this.f9878d) {
                try {
                    if (this.f9882h == null) {
                        return;
                    }
                    if (this.f9880f == null) {
                        ThreadPoolExecutor threadPoolExecutorM11732b = AbstractC2555c.m11732b("emojiCompat");
                        this.f9881g = threadPoolExecutorM11732b;
                        this.f9880f = threadPoolExecutorM11732b;
                    }
                    this.f9880f.execute(new Runnable() { // from class: androidx.emoji2.text.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f9885a.m11812c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public void m11814f(Executor executor) {
            synchronized (this.f9878d) {
                this.f9880f = executor;
            }
        }
    }

    public C2563k(Context context, C0769e c0769e) {
        super(new b(context, c0769e, f9874k));
    }

    /* JADX INFO: renamed from: c */
    public C2563k m11806c(Executor executor) {
        ((b) m11775a()).m11814f(executor);
        return this;
    }
}
