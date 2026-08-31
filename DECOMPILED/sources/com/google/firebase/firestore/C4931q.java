package com.google.firebase.firestore;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import p164V3.C1762g;
import p164V3.InterfaceC1763h;
import p179X4.InterfaceC1958E;
import p211b5.InterfaceC2971a;

/* JADX INFO: renamed from: com.google.firebase.firestore.q */
/* JADX INFO: loaded from: classes.dex */
class C4931q implements InterfaceC1763h, FirebaseFirestore.InterfaceC4914a {

    /* JADX INFO: renamed from: a */
    private final Map f18718a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final C1762g f18719b;

    /* JADX INFO: renamed from: c */
    private final Context f18720c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC2971a f18721d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC2971a f18722e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC1958E f18723f;

    C4931q(Context context, C1762g c1762g, InterfaceC2971a interfaceC2971a, InterfaceC2971a interfaceC2971a2, InterfaceC1958E interfaceC1958E) {
        this.f18720c = context;
        this.f18719b = c1762g;
        this.f18721d = interfaceC2971a;
        this.f18722e = interfaceC2971a2;
        this.f18723f = interfaceC1958E;
        c1762g.m7403h(this);
    }

    /* JADX INFO: renamed from: a */
    synchronized FirebaseFirestore m22190a(String str) throws Throwable {
        try {
            try {
                FirebaseFirestore firebaseFirestoreM22145h = (FirebaseFirestore) this.f18718a.get(str);
                if (firebaseFirestoreM22145h == null) {
                    firebaseFirestoreM22145h = FirebaseFirestore.m22145h(this.f18720c, this.f18719b, this.f18721d, this.f18722e, str, this, this.f18723f);
                    this.f18718a.put(str, firebaseFirestoreM22145h);
                }
                return firebaseFirestoreM22145h;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}
