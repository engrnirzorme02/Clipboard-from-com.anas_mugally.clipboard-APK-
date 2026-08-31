package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.AbstractC6118n;
import p010B0.C0047f;
import p010B0.InterfaceC0050i;
import p230d6.AbstractC5245a;
import p286k6.InterfaceC6077c;
import p304n0.AbstractC6428a;

/* JADX INFO: renamed from: androidx.lifecycle.S */
/* JADX INFO: loaded from: classes.dex */
public final class C2626S extends C2635a0.e implements C2635a0.c {

    /* JADX INFO: renamed from: b */
    private Application f10425b;

    /* JADX INFO: renamed from: c */
    private final C2635a0.c f10426c;

    /* JADX INFO: renamed from: d */
    private Bundle f10427d;

    /* JADX INFO: renamed from: e */
    private AbstractC2650l f10428e;

    /* JADX INFO: renamed from: f */
    private C0047f f10429f;

    public C2626S(Application application, InterfaceC0050i owner, Bundle bundle) {
        AbstractC6118n.m27187e(owner, "owner");
        this.f10429f = owner.mo198A();
        this.f10428e = owner.mo419P();
        this.f10427d = bundle;
        this.f10425b = application;
        this.f10426c = application != null ? C2635a0.a.f10446f.m12597a(application) : new C2635a0.a();
    }

    @Override // androidx.lifecycle.C2635a0.c
    /* JADX INFO: renamed from: a */
    public AbstractC2632Y mo12451a(Class modelClass) {
        AbstractC6118n.m27187e(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return m12572e(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.C2635a0.c
    /* JADX INFO: renamed from: b */
    public AbstractC2632Y mo12562b(InterfaceC6077c modelClass, AbstractC6428a extras) {
        AbstractC6118n.m27187e(modelClass, "modelClass");
        AbstractC6118n.m27187e(extras, "extras");
        return mo12570c(AbstractC5245a.m24241a(modelClass), extras);
    }

    @Override // androidx.lifecycle.C2635a0.c
    /* JADX INFO: renamed from: c */
    public AbstractC2632Y mo12570c(Class modelClass, AbstractC6428a extras) {
        AbstractC6118n.m27187e(modelClass, "modelClass");
        AbstractC6118n.m27187e(extras, "extras");
        String str = (String) extras.mo27640a(C2635a0.f10444c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.mo27640a(AbstractC2622N.f10416a) == null || extras.mo27640a(AbstractC2622N.f10417b) == null) {
            if (this.f10428e != null) {
                return m12572e(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.mo27640a(C2635a0.a.f10448h);
        boolean zIsAssignableFrom = AbstractC2634a.class.isAssignableFrom(modelClass);
        Constructor constructorM12575c = (!zIsAssignableFrom || application == null) ? AbstractC2627T.m12575c(modelClass, AbstractC2627T.f10431b) : AbstractC2627T.m12575c(modelClass, AbstractC2627T.f10430a);
        if (constructorM12575c == null) {
            return this.f10426c.mo12570c(modelClass, extras);
        }
        return (!zIsAssignableFrom || application == null) ? AbstractC2627T.m12576d(modelClass, constructorM12575c, AbstractC2622N.m12558b(extras)) : AbstractC2627T.m12576d(modelClass, constructorM12575c, application, AbstractC2622N.m12558b(extras));
    }

    @Override // androidx.lifecycle.C2635a0.e
    /* JADX INFO: renamed from: d */
    public void mo12571d(AbstractC2632Y viewModel) {
        AbstractC6118n.m27187e(viewModel, "viewModel");
        if (this.f10428e != null) {
            C0047f c0047f = this.f10429f;
            AbstractC6118n.m27184b(c0047f);
            AbstractC2650l abstractC2650l = this.f10428e;
            AbstractC6118n.m27184b(abstractC2650l);
            C2649k.m12622a(viewModel, c0047f, abstractC2650l);
        }
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC2632Y m12572e(String key, Class modelClass) {
        AbstractC2632Y abstractC2632YM12576d;
        Application application;
        AbstractC6118n.m27187e(key, "key");
        AbstractC6118n.m27187e(modelClass, "modelClass");
        AbstractC2650l abstractC2650l = this.f10428e;
        if (abstractC2650l == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC2634a.class.isAssignableFrom(modelClass);
        Constructor constructorM12575c = (!zIsAssignableFrom || this.f10425b == null) ? AbstractC2627T.m12575c(modelClass, AbstractC2627T.f10431b) : AbstractC2627T.m12575c(modelClass, AbstractC2627T.f10430a);
        if (constructorM12575c == null) {
            return this.f10425b != null ? this.f10426c.mo12451a(modelClass) : C2635a0.d.f10452b.m12602a().mo12451a(modelClass);
        }
        C0047f c0047f = this.f10429f;
        AbstractC6118n.m27184b(c0047f);
        C2621M c2621mM12623b = C2649k.m12623b(c0047f, abstractC2650l, key, this.f10427d);
        if (!zIsAssignableFrom || (application = this.f10425b) == null) {
            abstractC2632YM12576d = AbstractC2627T.m12576d(modelClass, constructorM12575c, c2621mM12623b.m12555Q());
        } else {
            AbstractC6118n.m27184b(application);
            abstractC2632YM12576d = AbstractC2627T.m12576d(modelClass, constructorM12575c, application, c2621mM12623b.m12555Q());
        }
        abstractC2632YM12576d.m12587a("androidx.lifecycle.savedstate.vm.tag", c2621mM12623b);
        return abstractC2632YM12576d;
    }
}
