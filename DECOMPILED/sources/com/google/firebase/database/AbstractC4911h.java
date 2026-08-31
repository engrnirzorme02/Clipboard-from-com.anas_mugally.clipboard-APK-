package com.google.firebase.database;

import p030D4.InterfaceC0210n;

/* JADX INFO: renamed from: com.google.firebase.database.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4911h {

    /* JADX INFO: renamed from: com.google.firebase.database.h$b */
    public interface b {
    }

    /* JADX INFO: renamed from: com.google.firebase.database.h$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        private boolean f18640a;

        /* JADX INFO: renamed from: b */
        private InterfaceC0210n f18641b;

        /* JADX INFO: renamed from: a */
        public InterfaceC0210n m22129a() {
            return this.f18641b;
        }

        /* JADX INFO: renamed from: b */
        public boolean m22130b() {
            return this.f18640a;
        }

        private c(boolean z7, InterfaceC0210n interfaceC0210n) {
            this.f18640a = z7;
            this.f18641b = interfaceC0210n;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static c m22128a() {
        return new c(false, null);
    }
}
