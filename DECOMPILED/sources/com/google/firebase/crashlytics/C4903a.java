package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p164V3.C1762g;
import p211b5.InterfaceC2971a;
import p218c4.C3014d;
import p219c5.InterfaceC3022e;
import p228d4.C5232d;
import p228d4.C5234f;
import p228d4.C5235g;
import p228d4.C5240l;
import p252g4.AbstractC5499i;
import p252g4.C5465C;
import p252g4.C5470H;
import p252g4.C5488a;
import p252g4.C5496f;
import p252g4.C5503m;
import p252g4.C5513w;
import p260h4.C5653i;
import p292l4.C6297b;
import p300m4.C6346g;
import p309n5.C6502b;
import p316o4.C6586g;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.a */
/* JADX INFO: loaded from: classes.dex */
public class C4903a {

    /* JADX INFO: renamed from: a */
    final C5513w f18620a;

    private C4903a(C5513w c5513w) {
        this.f18620a = c5513w;
    }

    /* JADX INFO: renamed from: b */
    static C4903a m22098b(C1762g c1762g, InterfaceC3022e interfaceC3022e, InterfaceC2971a interfaceC2971a, InterfaceC2971a interfaceC2971a2, InterfaceC2971a interfaceC2971a3, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3) {
        Context contextM7405l = c1762g.m7405l();
        String packageName = contextM7405l.getPackageName();
        C5235g.m24179f().m24184g("Initializing Firebase Crashlytics " + C5513w.m24885k() + " for " + packageName);
        C5653i c5653i = new C5653i(executorService, executorService2);
        C6346g c6346g = new C6346g(contextM7405l);
        C5465C c5465c = new C5465C(c1762g);
        C5470H c5470h = new C5470H(contextM7405l, packageName, interfaceC3022e, c5465c);
        C5232d c5232d = new C5232d(interfaceC2971a);
        C3014d c3014d = new C3014d(interfaceC2971a2);
        C5503m c5503m = new C5503m(c5465c, c6346g);
        C6502b.m27679e(c5503m);
        C5513w c5513w = new C5513w(c1762g, c5470h, c5232d, c5465c, c3014d.m14987e(), c3014d.m14986d(), c6346g, c5503m, new C5240l(interfaceC2971a3), c5653i);
        String strM7423c = c1762g.m7407p().m7423c();
        String strM24795m = AbstractC5499i.m24795m(contextM7405l);
        List<C5496f> listM24792j = AbstractC5499i.m24792j(contextM7405l);
        C5235g.m24179f().m24180b("Mapping file ID is: " + strM24795m);
        for (C5496f c5496f : listM24792j) {
            C5235g.m24179f().m24180b(String.format("Build id for %s on %s: %s", c5496f.m24772c(), c5496f.m24770a(), c5496f.m24771b()));
        }
        try {
            C5488a c5488aM24757a = C5488a.m24757a(contextM7405l, c5470h, strM7423c, strM24795m, listM24792j, new C5234f(contextM7405l));
            C5235g.m24179f().m24186i("Installer package name is: " + c5488aM24757a.f20824d);
            C6586g c6586gM27913l = C6586g.m27913l(contextM7405l, strM7423c, c5470h, new C6297b(), c5488aM24757a.f20826f, c5488aM24757a.f20827g, c6346g, c5465c);
            c6586gM27913l.m27921o(c5653i).addOnFailureListener(executorService3, new OnFailureListener() { // from class: c4.g
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    C5235g.m24179f().m24183e("Error fetching settings.", exc);
                }
            });
            if (c5513w.m24892p(c5488aM24757a, c6586gM27913l)) {
                c5513w.m24888i(c6586gM27913l);
            }
            return new C4903a(c5513w);
        } catch (PackageManager.NameNotFoundException e7) {
            C5235g.m24179f().m24183e("Error retrieving app package info.", e7);
            return null;
        }
    }
}
