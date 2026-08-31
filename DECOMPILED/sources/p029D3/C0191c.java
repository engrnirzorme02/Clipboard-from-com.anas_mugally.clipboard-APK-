package p029D3;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;
import p223d.C5173c;

/* JADX INFO: renamed from: D3.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C0191c {

    /* JADX INFO: renamed from: a */
    private final d f856a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0190b f857b;

    /* JADX INFO: renamed from: c */
    private final View f858c;

    /* JADX INFO: renamed from: D3.c$b */
    private static class b implements d {

        /* JADX INFO: renamed from: a */
        private OnBackInvokedCallback f859a;

        private b() {
        }

        @Override // p029D3.C0191c.d
        /* JADX INFO: renamed from: a */
        public void mo954a(View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f859a == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f859a);
            this.f859a = null;
        }

        @Override // p029D3.C0191c.d
        /* JADX INFO: renamed from: b */
        public void mo955b(InterfaceC0190b interfaceC0190b, View view, boolean z7) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f859a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback onBackInvokedCallbackMo956c = mo956c(interfaceC0190b);
                this.f859a = onBackInvokedCallbackMo956c;
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z7 ? 1000000 : 0, onBackInvokedCallbackMo956c);
            }
        }

        /* JADX INFO: renamed from: c */
        OnBackInvokedCallback mo956c(final InterfaceC0190b interfaceC0190b) {
            Objects.requireNonNull(interfaceC0190b);
            return new OnBackInvokedCallback() { // from class: D3.e
                public final void onBackInvoked() {
                    interfaceC0190b.mo945b();
                }
            };
        }

        /* JADX INFO: renamed from: d */
        boolean m957d() {
            return this.f859a != null;
        }
    }

    /* JADX INFO: renamed from: D3.c$c */
    private static class c extends b {

        /* JADX INFO: renamed from: D3.c$c$a */
        class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InterfaceC0190b f860a;

            a(InterfaceC0190b interfaceC0190b) {
                this.f860a = interfaceC0190b;
            }

            public void onBackCancelled() {
                if (c.this.m957d()) {
                    this.f860a.mo947d();
                }
            }

            public void onBackInvoked() {
                this.f860a.mo945b();
            }

            public void onBackProgressed(BackEvent backEvent) {
                if (c.this.m957d()) {
                    this.f860a.mo944a(new C5173c(backEvent));
                }
            }

            public void onBackStarted(BackEvent backEvent) {
                if (c.this.m957d()) {
                    this.f860a.mo946c(new C5173c(backEvent));
                }
            }
        }

        private c() {
            super();
        }

        @Override // p029D3.C0191c.b
        /* JADX INFO: renamed from: c */
        OnBackInvokedCallback mo956c(InterfaceC0190b interfaceC0190b) {
            return new a(interfaceC0190b);
        }
    }

    /* JADX INFO: renamed from: D3.c$d */
    private interface d {
        /* JADX INFO: renamed from: a */
        void mo954a(View view);

        /* JADX INFO: renamed from: b */
        void mo955b(InterfaceC0190b interfaceC0190b, View view, boolean z7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0191c(View view) {
        this((InterfaceC0190b) view, view);
    }

    /* JADX INFO: renamed from: a */
    private static d m948a() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            return new c();
        }
        if (i7 >= 33) {
            return new b();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private void m949d(boolean z7) {
        d dVar = this.f856a;
        if (dVar != null) {
            dVar.mo955b(this.f857b, this.f858c, z7);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m950b() {
        return this.f856a != null;
    }

    /* JADX INFO: renamed from: c */
    public void m951c() {
        m949d(false);
    }

    /* JADX INFO: renamed from: e */
    public void m952e() {
        m949d(true);
    }

    /* JADX INFO: renamed from: f */
    public void m953f() {
        d dVar = this.f856a;
        if (dVar != null) {
            dVar.mo954a(this.f858c);
        }
    }

    public C0191c(InterfaceC0190b interfaceC0190b, View view) {
        this.f856a = m948a();
        this.f857b = interfaceC0190b;
        this.f858c = view;
    }
}
