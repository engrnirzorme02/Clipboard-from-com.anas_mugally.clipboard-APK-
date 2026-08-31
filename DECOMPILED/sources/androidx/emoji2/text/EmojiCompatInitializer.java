package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.AbstractC2650l;
import androidx.lifecycle.InterfaceC2644f;
import androidx.lifecycle.InterfaceC2657s;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.C2807a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import p050G0.InterfaceC0467a;
import p081K.AbstractC0723o;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0467a {

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$a */
    class C2549a implements InterfaceC2644f {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC2650l f9806a;

        C2549a(AbstractC2650l abstractC2650l) {
            this.f9806a = abstractC2650l;
        }

        @Override // androidx.lifecycle.InterfaceC2644f
        /* JADX INFO: renamed from: d */
        public void mo11724d(InterfaceC2657s interfaceC2657s) {
            EmojiCompatInitializer.this.m11723e();
            this.f9806a.mo12628d(this);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$b */
    static class C2550b extends C2558f.c {
        protected C2550b(Context context) {
            super(new C2551c(context));
            m11776b(1);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$c */
    static class C2551c implements C2558f.h {

        /* JADX INFO: renamed from: a */
        private final Context f9808a;

        /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$c$a */
        class a extends C2558f.i {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C2558f.i f9809a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ ThreadPoolExecutor f9810b;

            a(C2558f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f9809a = iVar;
                this.f9810b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.C2558f.i
            /* JADX INFO: renamed from: a */
            public void mo11728a(Throwable th) {
                try {
                    this.f9809a.mo11728a(th);
                } finally {
                    this.f9810b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.C2558f.i
            /* JADX INFO: renamed from: b */
            public void mo11729b(C2566n c2566n) {
                try {
                    this.f9809a.mo11729b(c2566n);
                } finally {
                    this.f9810b.shutdown();
                }
            }
        }

        C2551c(Context context) {
            this.f9808a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.C2558f.h
        /* JADX INFO: renamed from: a */
        public void mo11726a(final C2558f.i iVar) {
            final ThreadPoolExecutor threadPoolExecutorM11732b = AbstractC2555c.m11732b("EmojiCompatInitializer");
            threadPoolExecutorM11732b.execute(new Runnable() { // from class: androidx.emoji2.text.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9850a.m11727c(iVar, threadPoolExecutorM11732b);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: c */
        public void m11727c(C2558f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                C2563k c2563kM11735a = AbstractC2556d.m11735a(this.f9808a);
                if (c2563kM11735a == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                c2563kM11735a.m11806c(threadPoolExecutor);
                c2563kM11735a.m11775a().mo11726a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th) {
                iVar.mo11728a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$d */
    static class RunnableC2552d implements Runnable {
        RunnableC2552d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AbstractC0723o.m3486a("EmojiCompat.EmojiCompatInitializer.run");
                if (C2558f.m11755i()) {
                    C2558f.m11751c().m11761l();
                }
            } finally {
                AbstractC0723o.m3487b();
            }
        }
    }

    @Override // p050G0.InterfaceC0467a
    /* JADX INFO: renamed from: a */
    public List mo2029a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p050G0.InterfaceC0467a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean mo2030b(Context context) {
        C2558f.m11754h(new C2550b(context));
        m11722d(context);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: d */
    void m11722d(Context context) {
        AbstractC2650l abstractC2650lMo419P = ((InterfaceC2657s) C2807a.m13988e(context).m13992f(ProcessLifecycleInitializer.class)).mo419P();
        abstractC2650lMo419P.mo12625a(new C2549a(abstractC2650lMo419P));
    }

    /* JADX INFO: renamed from: e */
    void m11723e() {
        AbstractC2555c.m11733c().postDelayed(new RunnableC2552d(), 500L);
    }
}
