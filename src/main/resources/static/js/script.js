
document.addEventListener('DOMContentLoaded' , function(){
        let ButtonOpenMonitoringProject = document.getElementById('btn_monitoring');
        let DivMonitoringProject = document.getElementById('all_projects');
        let HedaersProjectAllButtons = document.getElementById('header_projects_all_buttons');
        let buttonCloseAllProject = document.getElementById('btn_close_TableAll');

    ButtonOpenMonitoringProject.addEventListener('click' , function(){

        console.log("Open monitoring Project");
        DivMonitoringProject.style.display = 'block';
        HedaersProjectAllButtons.style.display = 'none';
    });  

    buttonCloseAllProject.addEventListener('click' , function(){

        DivMonitoringProject.style.display = 'none';
        HedaersProjectAllButtons.style.display = 'block';
    });   


});


document.addEventListener('DOMContentLoaded' , function(){
    let buttonCloseFormNewWorker = document.getElementById('btn_close_form_worker');
    let formWorker = document.getElementById('form_add_worker_admin');

    buttonCloseFormNewWorker.addEventListener('click' , function(){
        formWorker.style.display = 'none';
    });
});

document.addEventListener('DOMContentLoaded' , function(){
    let btnAdminActionNewWorker = document.getElementById("btn_add_new_worker");
    let actionWorkerBase = document.getElementById('action_workers_base');
    let adminFormActionAddWorker = document.getElementById('form_add_worker_admin');
    let btnActionAllWorker = document.getElementById('btn_all_workers');

    btnAdminActionNewWorker.addEventListener('click', function(){
        actionWorkerBase.style.display = 'none';
        adminFormActionAddWorker.style.display = 'block';
    });
    btnActionAllWorker.addEventListener('click' ,function(){
        actionWorkerBase.style.display = 'block';
    });

});

document.addEventListener('DOMContentLoaded' , function(){
    let btnAdminActionNewWorker = document.getElementById("btn_add_new_worker");
    let actionWorkerBase = document.getElementById('action_workers_base');
    let adminFormActionAddWorker = document.getElementById('form_add_worker_admin');

    btnAdminActionNewWorker.addEventListener('click', function(){
        actionWorkerBase.style.display = 'none';
        adminFormActionAddWorker.style.display = 'block';
    });

});